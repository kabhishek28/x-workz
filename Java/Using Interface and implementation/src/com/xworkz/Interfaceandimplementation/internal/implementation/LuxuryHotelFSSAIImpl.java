package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.FoodSafetyAuthority;

public class LuxuryHotelFSSAIImpl implements FoodSafetyAuthority {
    public LuxuryHotelFSSAIImpl() {
        System.out.println("LuxuryHotelFSSAIImpl const");
    }

    @Override
    public void checkHygiene() {
        System.out.println("checkHygiene method in LuxuryHotelFSSAIImpl class");
    }
}
