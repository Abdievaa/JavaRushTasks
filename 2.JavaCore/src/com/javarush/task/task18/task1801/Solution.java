package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        int maxByte = 0;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            while (inputStream.available() > 0) {
                int currentByte = inputStream.read();
                if (currentByte > maxByte){
                    maxByte = currentByte;
                }
            }

        }
        System.out.println(maxByte);


    }
}
