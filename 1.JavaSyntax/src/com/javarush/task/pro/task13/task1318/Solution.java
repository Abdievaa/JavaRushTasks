package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int ordinal = month.ordinal();
        Month[] months = Month.values();
        if(ordinal == 11){
            return months[0];
        }else{

            return months[ordinal+1];
        }

    }
}
