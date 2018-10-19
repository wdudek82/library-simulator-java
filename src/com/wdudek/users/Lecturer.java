package com.wdudek.users;

public class Lecturer extends User {

    public Lecturer(String firstName, String lastName, String CARD_NUMBER) {
        super(firstName, lastName, CARD_NUMBER, 10, UserType.L);

    }
}
