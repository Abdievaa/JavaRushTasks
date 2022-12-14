package com.javarush.task.pro.task14.task1422;

/* 
Сбор и сканирование ДНК
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        printDNA();
    }

    public static void printDNA() {
        List<StackTraceElement[]> dna = getDNA();
        for (int i = 0; i < dna.size(); i++) {
            StackTraceElement[] elements = dna.get(i);
            String fileName = elements[1].getFileName();
            String methodName = elements[1].getMethodName();
            int lineNumber = elements[1].getLineNumber();
            System.out.printf("File name: %s, Method name: %s, Line number: %d\n",
                    fileName,methodName,lineNumber);

        }

    }

    private static List<StackTraceElement[]> getDNA() {
        List<StackTraceElement[]> list = new ArrayList<>();

        list.add(adenine());
        list.add(thymine());
        list.add(cytosine());
        list.add(guanine());

        return list;
    }

    private static StackTraceElement[] adenine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] thymine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] cytosine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] guanine() {
        return Thread.currentThread().getStackTrace();
    }
}