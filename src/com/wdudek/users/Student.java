package com.wdudek.users;

public class Student extends User {

    public Student(String firstName, String lastName, String cardNumber) {
        super(firstName, lastName, cardNumber, 4, UserType.S);
    }
}
