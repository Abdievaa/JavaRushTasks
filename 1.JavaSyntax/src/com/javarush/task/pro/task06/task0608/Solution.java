package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(cube(3));
//        System.out.println(Math.pow(3, 3));
    }

    public static long cube(long number){
        return number * number * number;
        //return (long)Math.pow(number, 3);

    }
}
