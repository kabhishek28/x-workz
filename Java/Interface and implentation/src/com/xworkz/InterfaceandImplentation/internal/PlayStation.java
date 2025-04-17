package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.VideoGameConsole;

public class PlayStation implements VideoGameConsole {
    @Override
    public void powerOn() {
        System.out.println("PlayStation powering on.");
    }

    @Override
    public void loadGame() {
        System.out.println("PlayStation loading game.");
    }

    @Override
    public void powerOff() {
        System.out.println("PlayStation powering off.");
    }
}