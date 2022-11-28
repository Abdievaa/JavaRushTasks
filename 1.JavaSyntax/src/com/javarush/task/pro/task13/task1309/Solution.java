package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
       grades.put("Ivan Ivanov",4.0);
       grades.put("Sidorova Anya",5.0);
       grades.put("Kim Roman",4.5);
       grades.put("Sazonova Olesya ",4.8);
       grades.put("Morozova Nina", 3.8);

    }
}
