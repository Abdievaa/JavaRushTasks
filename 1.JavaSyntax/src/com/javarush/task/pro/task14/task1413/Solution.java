package com.javarush.task.pro.task14.task1413;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Лонг дринк
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
        String screwdriver = screwdriverIngredients.keySet().stream()
                .map(key -> key + "=" + screwdriverIngredients.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(screwdriver);
    }

    static Map<String, Integer> makeScrewdriver() {
        Map<String, Integer> ingredients = new TreeMap<>();
        addIce(ingredients);
        addVodka(ingredients);
        addJuice(ingredients);
        addOrange(ingredients);
        return ingredients;
    }

    static void addIce(Map<String, Integer> ingredients) {
        ingredients.put("ice cubes", 7);
    }

    static void addVodka(Map<String, Integer> ingredients) {
        ingredients.put("vodka", 50);
    }

    static void addJuice(Map<String, Integer> ingredients) {
        ingredients.put(null, 100);
    }

    static void addOrange(Map<String, Integer> ingredients) {
        ingredients.put("orange slice", 1);
    }

    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
        StackTraceElement stackTraceElement = stackTraceElements[1];
        System.out.println(stackTraceElement.getMethodName());
    }
}
