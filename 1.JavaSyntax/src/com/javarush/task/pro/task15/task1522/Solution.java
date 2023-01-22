package com.javarush.task.pro.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        try(InputStream stream = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream))){
            while (reader.ready()){
                String line = reader.readLine();
                System.out.println(line);
            }

        }



    }
}