package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.PollutionControlBoard;

public class SteelFactoryPollutionImpl implements PollutionControlBoard {
    public SteelFactoryPollutionImpl() {
        System.out.println("SteelFactoryPollutionImpl const");
    }

    @Override
    public void checkEmissions() {
        System.out.println("checkEmissions method in SteelFactoryPollutionImpl class");
    }
}
