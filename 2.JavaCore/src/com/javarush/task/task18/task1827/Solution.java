package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))) {
            int maxId = 0;
            while (reader.ready()) {
                String string = reader.readLine();
                String strId = string.substring(0, 8).trim();
                int id = Integer.parseInt(strId);
                if (id > maxId) {
                    maxId = id;
                }
            }
            if(args.length != 0){
                if(args[0].equals("-c")){
                    int id = maxId + 1;
                    String productName = args[1];
                    String price = args[2];
                    String quantity = args[3];

                    writer.newLine();
                    writer.write(id + productName + price + quantity);


                }

            }

        }

    }

}
