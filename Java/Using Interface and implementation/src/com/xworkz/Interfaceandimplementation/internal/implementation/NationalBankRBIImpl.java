package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.RBI;

public class NationalBankRBIImpl implements RBI {
    public NationalBankRBIImpl() {
        System.out.println("NationalBankRBIImpl const");
    }

    @Override
    public void maintainCRR() {
        System.out.println("maintainCRR method in NationalBankRBIImpl class");
    }
}
