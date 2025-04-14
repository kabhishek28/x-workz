package com.xworkz.ToString.internal;

public class BookStore {
    private String name;
    private int totalBooks;
    private String location;

    public BookStore(String name, int totalBooks, String location) {
        this.name = name;
        this.totalBooks = totalBooks;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Bookstore: " + name + ", Books: " + totalBooks + ", Location: " + location;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof BookStore) {
                BookStore other = (BookStore) object;
                if (this.name.equals(other.name) &&
                        this.location.equals(other.location)) {
                    return true;
                }
            }
        }
        return false;
    }
}
