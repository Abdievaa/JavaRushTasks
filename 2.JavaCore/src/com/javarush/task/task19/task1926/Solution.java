package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()))) {
            while (reader1.ready()){
                String line = reader1.readLine();
                StringBuilder builder = new StringBuilder();
                System.out.println(builder.append(line).reverse().toString());

            }


        }

    }
}
