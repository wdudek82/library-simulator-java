package com.wdudek;

import com.wdudek.resources.Book;
import com.wdudek.resources.Magazine;
import com.wdudek.resources.Resource;
import com.wdudek.users.Lecturer;
import com.wdudek.users.Student;
import com.wdudek.users.User;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("BUŁ");
        Student johnSnow = new Student("John", "Snow", "12345");
        Student johnSnow2 = new Student("John", "Snow", "12345");
        Lecturer jimRaynor = new Lecturer("Jim", "Raynor", "23456");
        Lecturer johnSummer = new Lecturer("John", "Summer", "12345");

        Book book = new Book("The Attention Revolution", "Alan B. Wallace", 6);
        Book book2 = new Book("The Attention Revolution", "Alan B. Wallace", 18);
        Book book3 = new Book("The Attention", "Alan B. Wallace", 6);
        Magazine magazine = new Magazine("Nie z tej Ziemi", "12/2000", 3);
        Magazine magazine2 = new Magazine("Nie z tej Ziemi", "12/2000", 2);
        Magazine magazine3 = new Magazine("Nieznany Świat", "1/1990", 33);

        List<Resource> resources = Arrays.asList(book, book2, book3, magazine, magazine2, magazine3);

        library.addResources(resources);

        // System.out.println(book.getAuthor());
        // System.out.println(book.getTitle());
        // System.out.println(book.getNoCopies());
        //
        // library.addResource(book);
        // library.addResource(magazine);
        //
        // library.addUser(johnSnow);
        // System.out.println("Add a user " + library.addUser(jimRaynor));
        // System.out.println("Add a user " + library.addUser(johnSnow2));
        // library.listLibraryUsers();

        library.listAllBooks();
        library.listAllMagazines();

        System.out.println("Contains: " + library.resources.contains(book2));

        // System.out.println("Items equal: " + (book.equals(magazine)));
    }
}
