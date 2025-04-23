package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.Laptop;

public class Windows implements Laptop {
    public Windows() {
        System.out.println("Windows const");
    }

    @Override
    public void process() {
        System.out.println("process method in Windows");
    }
}
