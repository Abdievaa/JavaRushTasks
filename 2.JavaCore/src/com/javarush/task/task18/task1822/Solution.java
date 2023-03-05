package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(console.readLine());
             BufferedReader reader = new BufferedReader(fileReader)) {
            while (reader.ready()){
                String line = reader.readLine();
                String[] strings = line.split(" ");
                if(strings[0].equals(args[0])){
                    System.out.println(line);
                }

            }

        }
    }
}
