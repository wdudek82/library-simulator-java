package com.wdudek;

import com.wdudek.resources.Book;
import com.wdudek.users.Lecturer;
import com.wdudek.users.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Snow", "12345");
        Lecturer lecturer = new Lecturer("Jim", "Raynor", "23456");

        Book book = new Book("The Attention Revolution", "Alan B. Wallace", 6);

        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getNoCopies());
    }
}
