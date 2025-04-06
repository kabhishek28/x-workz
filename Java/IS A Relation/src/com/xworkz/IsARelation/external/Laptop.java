package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Computer;

public class Laptop extends Computer {
    public Laptop(){
        System.out.println("no arguments of Laptop");
    }
    @Override
    public void boot() { System.out.println("@Override :Computer is booting up"); }
    @Override
    public void shutDown() { System.out.println("@Override :Computer is shutting down"); }
    @Override
    public void process() { System.out.println("@Override :Computer is processing"); }
    @Override
    public void connectToWiFi() { System.out.println("@Override :Computer is connected to WiFi"); }
    @Override
    public void installSoftware() { System.out.println("@Override :Installing software"); }

}
