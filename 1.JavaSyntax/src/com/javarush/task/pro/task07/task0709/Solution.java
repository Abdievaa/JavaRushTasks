package com.javarush.task.pro.task07.task0709;

/* 
Очень правильные типы
*/

public class Solution {
    long a = 109 + 15;
    int b = (int)a * 2;
    short c = (short) ((short)a / (short) b);
    byte d = (byte) ((byte) a + (byte) b - (byte)c);
}
