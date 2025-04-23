package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.ParentalControl;

public class GameApp implements ParentalControl {
    @Override
    public void restrictContent() {
        System.out.println("Game app restricts inappropriate content for minors.");
    }
}