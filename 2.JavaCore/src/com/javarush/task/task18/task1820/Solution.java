package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        PrintWriter writer = new PrintWriter(new FileWriter(file2))){
            while (bufferedReader.ready()){
                String[] strings = bufferedReader.readLine().split(" ");
                for (String string : strings) {
                    long round = Math.round(Double.parseDouble(string));
                    writer.print(round + " ");

                }


            }
        }

    }
}
