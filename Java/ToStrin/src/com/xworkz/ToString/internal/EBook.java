package com.xworkz.ToString.internal;

public class EBook {
    private String title;
    private String author;
    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        this.title = title;
        this.author = author;
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "EBook: " + title + " by " + author + ", Size: " + fileSize + "MB";
    }
}

    // Runner

