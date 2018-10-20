package com.wdudek;

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

    public List<User> getUsers() {
        return Collections.unmodifiableList(users);
    }

    public List<Resource> getResources() {
        return Collections.unmodifiableList(resources);
    }

}
