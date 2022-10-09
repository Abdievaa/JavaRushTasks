package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
       int height = 0;
       while(height<10){
           int width = 0;
           while (width<20) {
               if(height == 0 || height == 9){
                   System.out.print('Б');
               }else if(width == 0 || width == 19){
                   System.out.print('Б');
               }else{
                   System.out.print(' ');
               }
               width++;
           }
           System.out.println();
           height++;
       }

    }
}