package com.javarush.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Прощай, Паскаль
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        for (int i = 0; i < programmingLanguages.size(); i++) {
            programmingLanguages.remove("Pascal");
            System.out.println( programmingLanguages.get(i));


        }

    }
}