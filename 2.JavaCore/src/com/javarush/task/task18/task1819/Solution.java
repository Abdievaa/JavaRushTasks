package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try(FileInputStream inputStream1 = new FileInputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2)){
            while (inputStream2.available()>0){
                int read = inputStream2.read();
                byteArrayOutputStream.write(read);

            }
            while (inputStream1.available()>0){
                int read = inputStream1.read();
                byteArrayOutputStream.write(read);

            }
        }
        try(FileOutputStream outputStream = new FileOutputStream(file1)){
            byteArrayOutputStream.writeTo(outputStream);
        }
    }
}
