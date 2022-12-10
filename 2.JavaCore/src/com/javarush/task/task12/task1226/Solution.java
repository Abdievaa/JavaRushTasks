package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }
    public interface CanFly{
        public void fly();

    }

    public interface CanClimb{
        public void climb();
    }

    public interface CanRun{
       public void run();
    }

    public class Cat implements CanClimb,CanRun {
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat  {


    }

    public class Duck implements CanFly,CanRun {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
