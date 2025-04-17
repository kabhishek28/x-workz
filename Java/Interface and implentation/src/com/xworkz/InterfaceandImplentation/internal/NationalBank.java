package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Bank;

public class NationalBank implements Bank {
    @Override
    public void createAccount() {
        System.out.println("create account ");
    }

    @Override
    public void saveAmount() {
        System.out.println("save amount");
    }

    @Override
    public void getIntrest() {
        System.out.println("get intrest");
    }
}