package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException  {
        String file1;
        String file2;
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = console.readLine();
            file2 = console.readLine();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2))){
            while (reader.ready()){
                String line = reader.readLine();
                String replace = line.replaceAll("\\p{P}", "");
                writer.write(replace);

            }
        }


    }
}
