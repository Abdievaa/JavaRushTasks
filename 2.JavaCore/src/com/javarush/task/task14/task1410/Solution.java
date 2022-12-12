package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Wine wine = new Wine();
        wine.taste();
        return wine;

    }

    public static Wine getWine() {
        Wine wine = new Wine();
         wine.getHolidayName();
         return wine;


    }

    public static Wine getSparklingWine() {
        Wine wine = new SparklingWine();
        wine.getHolidayName();
        return wine;

    }
}
