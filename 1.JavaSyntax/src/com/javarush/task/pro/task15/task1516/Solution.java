package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String file = scanner.nextLine();
            if(file.isEmpty()){
                break;
            }
            if(Files.isDirectory(Path.of(file))){
                System.out.println(file + THIS_IS_DIR);
            } else if (Files.isRegularFile(Path.of(file))) {
                System.out.println(file + THIS_IS_FILE);

            }else {
                break;
            }
        }
    }
}

