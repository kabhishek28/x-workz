package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.DrugControlBoard;

public class Pharmacy {
    private DrugControlBoard drugControlBoard;

    public Pharmacy(DrugControlBoard drugControlBoard) {
        this.drugControlBoard = drugControlBoard;
    }

    public void getDrugControlBoard(){
        if(drugControlBoard != null){
            drugControlBoard.verifyDrugs();
        }else{
            System.out.println("DrugControlBoard is null");
        }
    }
}
