package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int comma = 0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine())){
            while (inputStream.available()>0){
                int read = inputStream.read();
                if(read == 44){
                    comma++;
                }
            }
            System.out.println(comma);
        }
    }
}
