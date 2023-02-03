package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() throws IllegalArgumentException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = reader.readLine();
            if(str.equals("helicopter")){
                result = new Helicopter();
            } else if (str.equals("plane")) {
                str = reader.readLine();
                result = new Plane(Integer.parseInt(str));
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
