package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk19/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int indexStart = path.indexOf("jdk");
        int indexEnd = path.indexOf("/",indexStart);
        String result =  path.substring(indexStart,indexEnd);
        return path.replaceAll(result, jdk);
       /* return path.replaceAll("jdk.*?/",jdk+"/");*/


    }
}
