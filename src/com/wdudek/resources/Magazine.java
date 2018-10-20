package com.wdudek.resources;

public class Magazine extends Resource {
    private String issue;

    public Magazine(String title, String issue, int noCopies) {
        super(title, noCopies);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return getTitle() + ";" +
                getIssue() + ";" +
                getNoCopies() + ";" +
                getNoAvailableCopies();
    }
}
