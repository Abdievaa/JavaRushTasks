package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        try (FileInputStream inputStream = new FileInputStream(file1);
             FileOutputStream outputStream = new FileOutputStream(file2)) {

            List<Integer> list = new ArrayList<>();
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                list.add(read);
            }
            Collections.reverse(list);
            for (Integer bytes : list) {
                outputStream.write(bytes);

            }
        }

    }
}
