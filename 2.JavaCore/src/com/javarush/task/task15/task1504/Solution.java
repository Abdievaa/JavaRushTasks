package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            //Add your code here

            return output;
        }


        public String toString() {
            return getOutputByBookType();
        }
    }
    public static class MarkTwinBook extends Book{
        private String title;

        public MarkTwinBook(String tittle) {
            super("Mark Twain");
            this.title = tittle;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }


}
