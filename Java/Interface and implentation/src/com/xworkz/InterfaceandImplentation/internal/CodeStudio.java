package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.IDE;

public class CodeStudio implements IDE {
    @Override
    public void writeCode() {
        System.out.println("Writing code in CodeStudio.");
    }
@Override
    public void compileCode() {
        System.out.println("Code compiled successfully.");
    }
@Override
    public void debugCode() {
        System.out.println("Debugging in progress...");
    }
}
