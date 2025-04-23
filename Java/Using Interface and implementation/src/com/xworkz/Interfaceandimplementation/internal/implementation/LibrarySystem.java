package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.BookRules;

public class LibrarySystem implements BookRules {
    @Override
    public void checkAvailability() {
        System.out.println("Library system checks book availability before issuing.");
    }
}