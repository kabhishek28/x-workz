package com.xworkz.ToString.internal;

import com.xworkz.ToString.external.BankHolder;

public class Bank {

    private  int accountNo;
    private String type;
    private String holderName;

    public Bank(int accountNo, String type, String holderName) {
        this.accountNo = accountNo;
        this.type = type;
        this.holderName = holderName;
    }

    @Override
    public String toString(){
        return "account no :"+accountNo +", Type :"+type+", holderName :"+holderName;
    }

    @Override
    public int hashCode(){
        return 4;
    }

//    @Override
//    public boolean equals(Object object){
//        if(object != null){
//            if(object instanceof BankHolder){
//                BankHolder bankHolder = (BankHolder) object;
//                if(this.accountNo == bankHolder.)
//            }
//        }
//
//        return false;
//    }
}
