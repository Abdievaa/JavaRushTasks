package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int radius = scanner.nextInt();
       double s = 3.14 * radius * radius;
       int result = (int)(Math.floor(s));
        System.out.println(result);

    }
}