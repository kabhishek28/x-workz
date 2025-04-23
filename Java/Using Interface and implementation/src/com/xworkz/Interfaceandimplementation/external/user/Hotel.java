package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.FoodSafetyAuthority;

public class Hotel {
    private FoodSafetyAuthority foodSafetyAuthority;

    public Hotel(FoodSafetyAuthority foodSafetyAuthority) {
        this.foodSafetyAuthority = foodSafetyAuthority;
    }

    public void getHotel(){
        if(foodSafetyAuthority != null){
            foodSafetyAuthority.checkHygiene();
        }else{
            System.out.println("foodSafetyAuthority is null");

        }
    }
}
