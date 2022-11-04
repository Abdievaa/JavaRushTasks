package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
      JavarushQuest [] javarush = JavarushQuest.values();
      for (JavarushQuest j : javarush ){
          System.out.println(j.ordinal());
      }


    }
}
