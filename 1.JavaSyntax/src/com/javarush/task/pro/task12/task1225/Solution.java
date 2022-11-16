package com.javarush.task.pro.task12.task1225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Аккаунт ИнстаМатрицы
*/

public class Solution {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");
        for (String a : accountsList){
            System.out.println(a);

        }
    }

    public static void convertAccounts() {
        String [] accounts = Accounts.getAccounts();
        accountsList.addAll(Arrays.asList(accounts));
    }

    public static void registerAccount(String username) {
       if(accountsList.contains(username)){
           System.out.println();
       }else{
           accountsList.add(username);

       }
    }
}