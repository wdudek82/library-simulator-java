package com.wdudek.resources;

public abstract class Resource {
    private String title;
    private int noCopies;
    private int noBorrowed = 0;

    public Resource(String title, int noCopies) {
        this.title = title;
        this.noCopies = noCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoCopies() {
        return noCopies;
    }

    public void setNoCopies(int noCopies) {
        this.noCopies = noCopies;
    }

    public int getNoAvailableCopies() {
        return noCopies - noBorrowed;
    }

    @Override
    public abstract String toString();

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object obj);
}
