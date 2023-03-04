package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1 = reader.readLine()));
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2 = reader.readLine()))){
            while (bufferedReader1.ready()){
                String line = bufferedReader1.readLine();
                bufferedWriter.write(line.replaceAll("\\.", "!"));
            }

        }

    }
}
