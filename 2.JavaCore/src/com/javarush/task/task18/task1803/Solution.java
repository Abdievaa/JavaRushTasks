package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] byteCountArray = new int [256];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                byteCountArray[read]++;
            }
        }
         IntStream.range(0, byteCountArray.length)
                .filter(i -> byteCountArray[i] == Arrays.stream(byteCountArray).max().getAsInt())
                 .boxed()
                 .collect(Collectors.toList())
                 .forEach(number -> System.out.print(number + " "));




//        int maxCount = 0;
//        for (int i = 0; i < byteCountArray.length; i++) {
//            if (maxCount < byteCountArray[i]) {
//                maxCount = byteCountArray[i];
//            }
//        }
//
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < byteCountArray.length; i++) {
//            if(maxCount == byteCountArray[i]){
//                list.add(i);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

    }
}
