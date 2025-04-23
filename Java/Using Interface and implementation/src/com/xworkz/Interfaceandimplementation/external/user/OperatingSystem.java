package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.Laptop;

public class OperatingSystem {
    private Laptop laptop;

    public OperatingSystem(Laptop laptop) {
        this.laptop = laptop;
    }

    public void getLaptop(){
        if(laptop != null){
            laptop.process();
        }else{
            System.out.println("laptop is null");
        }
    }
}
