package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Laptop;
import com.xworkz.IsARelation.internal.Computer;

public class ComputerHandler {



        public ComputerHandler() {
            System.out.println("ComputerHandler Constructor");
        }

        public void handleComputer(Computer computer) {
            if (computer != null) {
                computer.boot();
                computer.shutDown();
                computer.process();
                computer.connectToWiFi();
                computer.installSoftware();

                if (computer instanceof Laptop) {
                    Laptop laptop = (Laptop) computer;
                    laptop.portable();
                } else {
                    System.out.println("Computer is not an instance of Laptop.");
                }
            }
        }


}
