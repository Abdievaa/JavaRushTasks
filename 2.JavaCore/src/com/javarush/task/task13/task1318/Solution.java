package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
             BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream))) {
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }
        }
    }
}