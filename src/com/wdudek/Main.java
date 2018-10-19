package com.wdudek;

import com.wdudek.users.Lecturer;
import com.wdudek.users.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Snow", "12345");
        Lecturer lecturer = new Lecturer("Jim", "Raynor", "23456");

        System.out.println(student.getBorrowedItemsLimit());
        System.out.println(lecturer.getBorrowedItemsLimit());
    }
}
