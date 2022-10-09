package com.javarush.task.pro.task05.task0508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i]= reader.readLine();
        }

        for (int i = 0; i < strings.length-1; i++) {
            if(strings[i].equals(strings[i+1])){
                strings[i] = null;
                strings[i+1]= null;
            }

        }






        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }


    }
}
