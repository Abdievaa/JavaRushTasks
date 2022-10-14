package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arrays = new int[number];
        for (int i = 0; i < number; i++) {
            arrays[i] = scanner.nextInt();
        }


        if (number % 2 != 0) {
            for (int i = 0; i < arrays.length; i++) {
                System.out.println(arrays[i]);

            }
        } else {
            for (int i = arrays.length-1; i >=0 ; i--) {
                System.out.println(arrays[i]);

            }
        }
    }
}

