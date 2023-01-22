package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        try(OutputStream stream = connection.getOutputStream()){
            stream.write("Hello".getBytes());
        }
        try(InputStream inputStream = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){
            while (reader.ready()){
                String readLine = reader.readLine();
                System.out.println(readLine);
            }
        }

    }
}

