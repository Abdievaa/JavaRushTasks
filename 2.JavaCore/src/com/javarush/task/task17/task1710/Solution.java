package com.javarush.task.task17.task1710;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
        Person person = null;
        if(args[0].equals("-c")){
           if (args[2].equalsIgnoreCase("м")){
                person = Person.createMale(args[1], inputFormat.parse(args[3]));
           } else if (args[2].equalsIgnoreCase("ж")) {
                person = Person.createFemale(args[1], inputFormat.parse(args[3]));
           }
           allPeople.add(person);
            System.out.println(allPeople.size()-1);
        } else if (args[0].equals("-r")) {
             person = allPeople.get(Integer.parseInt(args[1]));
            if(person != null){




                System.out.println(person.getName()+ " " + person.getSex() + " " + person.getBirthDate());


            }

        }

    }
}