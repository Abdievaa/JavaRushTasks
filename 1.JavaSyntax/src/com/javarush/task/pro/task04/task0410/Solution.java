package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt(); //4
        int secondMin = scanner.nextInt(); //8

        if (secondMin < min) {
            int temp = secondMin;
            secondMin = min;
            min = temp;
        }

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt(); // -10
            if (min == secondMin && secondMin < number) {
                secondMin = number;
            } else if (number < min) {
                secondMin = min;
                min = number;
            } else if (number > min && number < secondMin) {
              secondMin = number;

            }
        }


        System.out.println(secondMin);
    }
}