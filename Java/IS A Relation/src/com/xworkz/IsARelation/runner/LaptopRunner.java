package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Laptop;
import com.xworkz.IsARelation.internal.Computer;

public class LaptopRunner {
    public static void main(String[] args) {

        Computer computer1 = new Computer();
        computer1.boot();
        computer1.connectToWiFi();
        computer1.installSoftware();
        computer1.process();
        computer1.shutDown();

        System.out.println("-----------------------");

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

