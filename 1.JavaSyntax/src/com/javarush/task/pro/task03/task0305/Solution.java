package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1== num2 || num1==num3){
            System.out.print(num1 + " ");
        }if (num2 == num1 || num2==num3) {
            System.out.print(num2+ " ");

        }if(num3 == num1 || num3 ==num2){
            System.out.print(num3+" ");
        }
    }
}
