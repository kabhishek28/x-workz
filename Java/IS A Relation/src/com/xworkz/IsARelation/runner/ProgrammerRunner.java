package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.WebDeveloper;
import com.xworkz.IsARelation.internal.Programmer;

public class ProgrammerRunner {
    public static void main(String[] args) {
        Programmer programmer = new WebDeveloper();
        programmer.writeCode();
        programmer.debug();
        programmer.testSoftware();
        programmer.deploy();
        programmer.updateSoftware();
        System.out.println("--------------------");
        WebDeveloper webDeveloper = new WebDeveloper();
        webDeveloper.writeCode();
        webDeveloper.debug();
        webDeveloper.testSoftware();
        webDeveloper.deploy();
        webDeveloper.updateSoftware();

    }
}
