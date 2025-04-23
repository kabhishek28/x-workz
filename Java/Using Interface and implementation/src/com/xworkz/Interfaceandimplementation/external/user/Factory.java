package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.implementation.SteelFactoryPollutionImpl;
import com.xworkz.Interfaceandimplementation.internal.rules.PollutionControlBoard;

public class Factory {
    private PollutionControlBoard pollutionControlBoard ;

    public Factory(PollutionControlBoard pollutionControlBoard) {
        this.pollutionControlBoard = pollutionControlBoard;
    }

    public void getPollutionControlBoard(){
        if(pollutionControlBoard != null){
            pollutionControlBoard.checkEmissions();
        }else{
            System.out.println("PollutionControlBoard is null");
        }
    }
}
