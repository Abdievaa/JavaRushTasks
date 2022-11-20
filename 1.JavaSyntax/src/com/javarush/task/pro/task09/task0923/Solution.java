package com.javarush.task.pro.task09.task0923;

/* 
Ранг доступа — Пиратский Капитан
*/

import static com.javarush.task.pro.task09.task0923.CaptainBridge.*;

public class Solution {
    public static void main(String[] args) {

        String [] rank = {"Раб", "Гость", "Боец", "Ветеран", "Картографист", "Капитан", "Стив"};
        String name = "";
         for (int i = 0; i < rank.length; i++) {
            if(debugAccess(rank[i])){
                name = rank[i];
            }

        }
        checkAccess(name);




    }
}
