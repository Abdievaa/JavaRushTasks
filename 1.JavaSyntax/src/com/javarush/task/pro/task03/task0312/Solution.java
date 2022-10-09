package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.next();
        String text2 = scanner.next();
        if(text1.equals(text2)){
            System.out.println("строки одинаковые");

        }else{

            System.out.println("строки разные");
        }
    }
}
