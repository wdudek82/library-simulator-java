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

    @Override
    public int hashCode() {
        return getTitle().hashCode() +
                getIssue().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Magazine) {
            return ((Magazine) obj).getTitle().equals(this.getTitle()) &&
                    ((Magazine) obj).getIssue().equals(issue);
        }
        return false;
    }
}
