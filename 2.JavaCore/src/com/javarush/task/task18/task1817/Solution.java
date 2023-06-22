package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException; 

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int symbols = 0;
        int spaces = 0;
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                int read = reader.read();
                symbols++;
                if (read == (int) ' ') {
                    spaces++;
                }
            }
        }
        if (symbols != 0) {
            double result = (double) spaces / symbols * 100;
            System.out.printf("%.2f", result);
        }


    }
}
