package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.TreeMap;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = reader.readLine();
            if (line.equals("end")) {
                break;
            }
            String substring = line.substring(line.lastIndexOf("t") + 1);
            int index = Integer.parseInt(substring);
            if(!map.containsKey(index)){
                map.put(index,line);
            }
        }
        for (String fileName : map.values()) {
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(shortName))){
                while (inputStream.available()>0){
                    outputStream.write(inputStream.read());
                }
            }
        }


    }
}
