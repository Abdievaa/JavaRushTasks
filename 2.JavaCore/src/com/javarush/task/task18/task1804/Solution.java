package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        byte [] byteCountArray = new byte[256];
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine())){
            while (inputStream.available() > 0){
                int read = inputStream.read();
                byteCountArray[read]++;

            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < byteCountArray.length; i++) {
                if(byteCountArray[i] > 0 && byteCountArray[i] < min){
                    min = byteCountArray[i];
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < byteCountArray.length; i++) {
                if(min == byteCountArray[i]){
                    list.add(i);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");

            }

        }

    }
}
