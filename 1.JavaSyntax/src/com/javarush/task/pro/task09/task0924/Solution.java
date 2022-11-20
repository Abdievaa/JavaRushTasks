package com.javarush.task.pro.task09.task0924;

/* 
Взлом Стального Стива
*/

import java.util.Arrays;

public class Solution {

    public static String[][] morals = {{"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };

    public static void main(String[] args) {
        cleanMorals();
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static void cleanMorals() {
        for (int i = 0; i < morals.length; i++) {
            for (int j = 0; j < morals[i].length; j++) {
                String result = morals[i][j];
                String str = result.toLowerCase();
                if(str.contains("killer")){
                    morals[i][j] = "compassion";
                }else if(str.contains("thief")){
                    morals[i][j] = "fairness";
                }else if(str.contains("bully")){
                    morals[i][j] = "respect";
                }

            }

        }

    }
}