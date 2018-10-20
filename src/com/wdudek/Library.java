package com.wdudek;

import com.wdudek.resources.Book;
import com.wdudek.resources.Resource;
import com.wdudek.users.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private String name;
    private List<User> users;
    private List<Resource> resources;

    public Library(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        this.resources = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addUser(User user) {
        // search in user list if already added
        users.add(user);
        return true;
    }

    public void listLibraryUsers() {
        System.out.println("==========================");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("==========================");
    }

    public boolean addResource(Resource resource) {
        // search in resources if already added
        resources.add(resource);
        return true;
    }

    public void listAllMagazines() {
        listLibraryResources("Magazine");
    }

    public void listAllBooks() {
        listLibraryResources("Book");
    }

    private void listLibraryResources(String type) {
        System.out.println("============================");
        for (Resource resource : resources) {
            if (resource.getClass().getSimpleName().equals(type)) {
                System.out.println(resource);
            }
        }
        System.out.println("============================");
    }
}
