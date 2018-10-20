package com.wdudek;

import com.wdudek.resources.Book;
import com.wdudek.resources.Magazine;
import com.wdudek.users.Lecturer;
import com.wdudek.users.Student;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("BUŁ");
        Student johnSnow = new Student("John", "Snow", "12345");
        Lecturer jimRaynor = new Lecturer("Jim", "Raynor", "23456");

        Book book = new Book("The Attention Revolution", "Alan B. Wallace", 6);
        Magazine magazine = new Magazine("Nie z tej Ziemi", "12/2000", 3);

        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getNoCopies());

        library.addResource(book);
        library.addResource(magazine);

        library.addUser(johnSnow);
        library.addUser(jimRaynor);
        library.listLibraryUsers();

        library.listAllBooks();
        library.listAllMagazines();
    }
}
