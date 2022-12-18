package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Path path = Paths.get(name);
        List<String> strings = Files.readAllLines(path);
        for (String str : strings){
            String str1 = str.replaceAll(" ", "");
            String str2 = str1.replaceAll("\\.", "");
            String str3 = str2.replaceAll(",", "");
//            str.replaceAll("[.,\\s]", "");


            System.out.println(str3);
        }

    }
}

