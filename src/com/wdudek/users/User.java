package com.wdudek.users;

import com.wdudek.resources.Resource;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String firstName;
    private String lastName;
    private final String CARD_NUMBER;
    private List<Resource> borrowedResources;
    private final int BORROWED_ITEMS_LIMIT;
    private UserType userType;

    public User(String firstName, String lastName, String CARD_NUMBER, int BORROWED_ITEMS_LIMIT, UserType userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CARD_NUMBER = CARD_NUMBER;
        this.borrowedResources = new ArrayList<>();
        this.BORROWED_ITEMS_LIMIT = BORROWED_ITEMS_LIMIT;
        this.userType = userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return CARD_NUMBER;
    }

    public int getBorrowedItemsLimit() {
        return BORROWED_ITEMS_LIMIT;
    }

    public List<Resource> getBorrowedResources() {
        return borrowedResources;
    }

    public UserType getUserType() {
        return userType;
    }
}
