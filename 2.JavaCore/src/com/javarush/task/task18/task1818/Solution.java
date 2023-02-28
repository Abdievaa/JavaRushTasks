package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        try(FileOutputStream outputStream = new FileOutputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);
        FileInputStream inputStream3 = new FileInputStream(file3)){

            while (inputStream2.available()>0){
                int read = inputStream2.read();
                outputStream.write(read);
            }
            while (inputStream3.available()>0){
                int read = inputStream3.read();
                outputStream.write(read);
            }

        }


    }
}
