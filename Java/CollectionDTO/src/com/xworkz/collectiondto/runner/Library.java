package com.xworkz.collectiondto.runner;

import com.xworkz.collectiondto.dto.LibraryDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Library {

    public static void main(String[] args) {
        Collection<LibraryDTO> libraryDataCollection = new ArrayList<>();
        libraryDataCollection.add(new LibraryDTO("The Alchemist", "Paulo Coelho", "Fiction", 1988, "HarperOne", true, 399.0));
        libraryDataCollection.add(new LibraryDTO("Clean Code", "Robert C. Martin", "Programming", 2008, "Prentice Hall", false, 699.0));
        libraryDataCollection.add(new LibraryDTO("Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography", 1999, "Universities Press", true, 299.0));
        libraryDataCollection.add(new LibraryDTO("Atomic Habits", "James Clear", "Self-Help", 2018, "Penguin Random House", true, 499.0));
        libraryDataCollection.add(new LibraryDTO("1984", "George Orwell", "Dystopian", 1949, "Secker & Warburg", false, 250.0));
        libraryDataCollection.add(new LibraryDTO("The Silent Patient", "Alex Michaelides", "Thriller", 2019, "Celadon Books", true, 370.0));
        libraryDataCollection.add(new LibraryDTO("Sapiens", "Yuval Noah Harari", "History", 2011, "Harvill Secker", false, 550.0));
        libraryDataCollection.add(new LibraryDTO("Introduction to Algorithms", "Thomas H. Cormen", "Education", 2009, "MIT Press", true, 1250.0));
        libraryDataCollection.add(new LibraryDTO("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 1997, "Plata Publishing", true, 430.0));
        libraryDataCollection.add(new LibraryDTO("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 1925, "Scribner", false, 300.0));


        for(LibraryDTO libraryDTO : libraryDataCollection){
            System.out.println(libraryDTO.toString());
            System.out.println("------------------------------------------------------------------------------------------------");
        }
    }
}
