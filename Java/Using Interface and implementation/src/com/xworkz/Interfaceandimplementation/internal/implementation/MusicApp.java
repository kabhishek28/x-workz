package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.ContentModeration;

public class MusicApp implements ContentModeration {
    @Override
    public void checkExplicitContent() {
        System.out.println("Music app checks for explicit content before publishing.");
    }
}