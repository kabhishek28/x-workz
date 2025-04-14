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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof EBook) {
                EBook other = (EBook) object;
                if (this.title.equals(other.title) &&
                        this.author.equals(other.author) &&
                        this.fileSize == other.fileSize) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner

