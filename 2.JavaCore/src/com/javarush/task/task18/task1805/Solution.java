package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;


/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        Set<Integer> set = new TreeSet<>();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                set.add(read);

            }
//            for (Integer bytes : set) {
//                System.out.println(bytes + " ");
//
//            }

        }
    }
}
