package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            int count = 0;
            while (reader.ready()) {
                int read = reader.read();
                if (read >= 65 && read <= 90 || read >= 97 && read <= 122) {
                    count++;
                }
            }
            System.out.println(count);
        }


    }

}
