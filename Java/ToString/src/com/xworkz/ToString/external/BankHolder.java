package com.xworkz.ToString.external;

import com.xworkz.ToString.internal.Bank;

public class BankHolder extends Bank {
    public BankHolder(int accountNo, String type, String holderName){
    super( accountNo,  type,  holderName);
        System.out.println("BankHolder const");
    }



}
