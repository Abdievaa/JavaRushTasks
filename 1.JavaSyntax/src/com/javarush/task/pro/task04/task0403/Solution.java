package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEnter = false;
        int sum = 0;
        while (!isEnter) {
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                sum = sum + x;
            } else if (scanner.hasNext()) {
                String s = scanner.next();
                if (s.equals("ENTER")) {
                    isEnter = true;
                }


            }
        }
            System.out.println(sum);

    }
}