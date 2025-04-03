package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Laptop;
import com.xworkz.IsARelation.internal.Computer;

public class LaptopRunner {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.boot();
        laptop.connectToWiFi();
        laptop.installSoftware();
        laptop.process();
        laptop.shutDown();

        System.out.println("-----------------------");

        Computer computer = new Laptop();
        computer.boot();
        computer.connectToWiFi();
        computer.installSoftware();
        computer.process();
        computer.shutDown();

    }
}

