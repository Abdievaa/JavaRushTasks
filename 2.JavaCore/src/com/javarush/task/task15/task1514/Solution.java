package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    static {
        labels.put(30.0, "Jane");
        labels.put(1.0, "Anna");
        labels.put(302.0, "Kamila");
        labels.put(25.0, "Mike");
        labels.put(65.0, "Nike");
    }
}
