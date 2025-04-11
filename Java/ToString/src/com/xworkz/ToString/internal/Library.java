package com.xworkz.ToString.internal;

public class Library {

        private String bookTitle;
        private String author;
        private int totalPages;

        public Library(String bookTitle, String author, int totalPages) {
            this.bookTitle = bookTitle;
            this.author = author;
            this.totalPages = totalPages;
        }

        @Override
        public String toString() {
            return "Book: " + bookTitle + " by " + author + ", Pages: " + totalPages;
        }

    @Override
    public int hashCode(){
        return 4;
    }
}
