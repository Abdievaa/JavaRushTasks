package com.javarush.task.task16.task1630;

import java.io.*;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private StringBuilder builder = new StringBuilder();


        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;

        }

        @Override
        public String getFileContent() {
            return builder.toString();
        }

        @Override
        public void run() {
            try(BufferedReader reader = new BufferedReader(new FileReader(fullFileName))){
                while (reader.ready()){
                    String line = reader.readLine();
                    builder.append(line).append(" ");
                }
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
