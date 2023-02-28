package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        try(FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3)){
            int halfFile = (inputStream.available() + 1) / 2;
            int numberOfByte = 0;
            while (inputStream.available()>0){
                if(numberOfByte < halfFile){
                    outputStream1.write(inputStream.read());
                    numberOfByte++;
                }else {
                    outputStream2.write(inputStream.read());
                }

            }


        }

    }
}
