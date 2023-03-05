package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String str = args[0];
        if(!(str.equals("-e") || str.equals("-d"))){
            return;
        }
        try(FileInputStream inputStream = new FileInputStream(args[0]);
        FileOutputStream outputStream = new FileOutputStream(args[1])){

        }

    }

}
