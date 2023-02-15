package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }

    public static void main(String[] args) {

    }

    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThread3 extends Thread {
        @Override
        public void run() {
            while (true){
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    public static class MyThread4 extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class MyThread5 extends Thread {
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                int sum = 0;
                while (true) {
                    String string = reader.readLine();
                    if (string.equals("N")) {
                        break;
                    }
                    sum += Integer.parseInt(string);
                }
                System.out.println(sum);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}