package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.PC;

public class PCRunner {
    public static void main(String[] args) {
        PC pc = new PC();
        pc.connectToWiFi();
        pc.boot();
        pc.installSoftware();
    }
}
