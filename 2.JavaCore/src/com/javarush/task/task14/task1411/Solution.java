package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
           String key = reader.readLine();
            if (key.equalsIgnoreCase("user")) {
                doWork(new Person.User());
            } else if (key.equalsIgnoreCase("loser")) {
                doWork(new Person.Loser());
            } else if (key.equalsIgnoreCase("coder")) {
                doWork(new Person.Coder());
            } else if (key.equalsIgnoreCase("proger")) {
                doWork(new Person.Proger());
            } else {
                break;
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            Person.User user = (Person.User) person;
            user.live();
        } else if (person instanceof Person.Loser) {
            Person.Loser loser = (Person.Loser) person;
            loser.doNothing();
        } else if (person instanceof Person.Coder) {
            Person.Coder coder = (Person.Coder) person;
            coder.writeCode();

        } else if (person instanceof Person.Proger) {
            Person.Proger proger = (Person.Proger) person;
            proger.enjoy();
        }
    }
}
