package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.BookRules;

public class LocalLibraryBookImpl       {
    private BookRules bookRules;

    public LocalLibraryBookImpl(BookRules bookRules) {
        this.bookRules = bookRules;
    }

    public void verifyBookStatus() {
        if (bookRules != null) {
            bookRules.checkAvailability();
        } else {
            System.out.println("BookRules is null");
        }
    }
}

