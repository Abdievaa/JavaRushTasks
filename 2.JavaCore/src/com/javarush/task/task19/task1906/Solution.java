package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       String fileName1;
       String fileName2;
       try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
           fileName1 = reader.readLine();
           fileName2 = reader.readLine();

       }
       ArrayList<Integer> list = new ArrayList<>();
       try(FileReader reader = new FileReader(fileName1)){
           while (reader.ready()){
               int read = reader.read();
               list.add(read);
           }
       }
       try(FileWriter writer = new FileWriter(fileName2)){
           for (int i = 1; i < list.size(); i+=2) {
               writer.write(list.get(i));


           }
       }



    }
}
