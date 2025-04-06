package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Programmer;

public class WebDeveloper extends Programmer {
    public WebDeveloper() {
        System.out.println("Web Developer Constructor");
    }


@Override
    public void writeCode() {
        System.out.println("@Override :Programmer is writing code");
    }
    @Override
    public void debug() {
        System.out.println("@Override :Programmer is debugging code");
    }
    @Override
    public void testSoftware() {
        System.out.println("@Override :Programmer is testing software");
    }
    @Override
    public void deploy() {
        System.out.println("@Override :Programmer is deploying the application");
    }
    @Override
    public void updateSoftware() {
        System.out.println("@Override :Programmer is updating the software");
    }
}
