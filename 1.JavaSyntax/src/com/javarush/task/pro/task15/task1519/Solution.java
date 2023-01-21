package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> path = Files.newDirectoryStream(sourceDirectory)){
            for (Path paths : path) {
                if(Files.isRegularFile(paths)){
                    Path resolve = targetDirectory.resolve(paths.getFileName());
                    Files.copy(paths,resolve);

                }

            }
        }

    }
}

