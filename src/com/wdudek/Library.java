package com.wdudek;

import com.wdudek.resources.Resource;
import com.wdudek.users.User;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<User> users;
    public List<Resource> resources;

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
        if (!isInUserList(user)) {
            users.add(user);
            return true;
        }
        return false;
    }

    public boolean isInUserList(User user) {
        return users.contains(user);
    }

    public boolean isInUserList(String cardNumber) {
        for (User user : users) {
            if (user.CARD_NUMBER.equals(cardNumber)) {
                return true;
            }
        }
        return false;
    };

    public void listLibraryUsers() {
        System.out.println("==========================");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("==========================");
    }

    public boolean addResource(Resource resource) {
        if (!resources.contains(resource)) {
            resources.add(resource);
            return true;
        }
        return false;
    }

    public void addResources(List<Resource> resources) {
        for (Resource resource : resources) {
            if (this.resources.contains(resource)) {
                System.out.println("Incremented: ");
                incrementResourceAmount(resource);
            } else {
                System.out.println("Added: " + resource);
                this.resources.add(resource);
            }
        }
    }

    private void incrementResourceAmount(Resource resource) {
        int resourceIndex = this.resources.indexOf(resource);
        Resource libraryResource = this.resources.get(resourceIndex);
        int currentAmount = libraryResource.getNoCopies();
        int additionalAmount = resource.getNoCopies();
        libraryResource.setNoCopies(currentAmount + additionalAmount);
    }

    // TODO: Move to separate class? Eg. LibraryManager?
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
