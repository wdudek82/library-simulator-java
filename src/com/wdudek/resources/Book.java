package com.wdudek.resources;

public class Book extends Resource {
    private String author;

    public Book(String title, String author, int noCopies) {
        super(title, noCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return getTitle() + ";" +
                getAuthor() + ";" +
                getNoCopies() + ";" +
                getNoAvailableCopies();
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode() +
                getAuthor().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            return ((Book) obj).getAuthor().equals(author) &&
                    ((Book) obj).getTitle().equals(this.getTitle());
        }
        return false;
    }
}
