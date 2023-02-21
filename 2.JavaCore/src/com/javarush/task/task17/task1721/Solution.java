package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = null;
        String file2 = null;
        try {
            file1 = reader.readLine();
            file2 = reader.readLine();
            reader.close();
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            String input;
            while ((input = reader1.readLine()) != null) {
                allLines.add(input);
            }
            reader1.close();
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            while ((input = reader2.readLine()) != null) {
                forRemoveLines.add(input);
            }
            reader2.close();
            new Solution().joinData();
        } catch (IOException e) {

        }
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }


    }
}
