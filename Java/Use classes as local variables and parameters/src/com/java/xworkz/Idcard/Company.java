package com.java.xworkz.Idcard;

public class Company {
    public void getIDCard(IDCard[] idCards){
        if(idCards != null){
            for(IDCard ref:idCards){
                System.out.println("---------ID CARD----------");
                System.out.println("Material :"+ref.getMaterial());
                System.out.println("colors :"+ref.getColors());
                System.out.println("Weight :"+ref.getWeight());
                System.out.println("Designed by :"+ref.getDesignedBy());
            }
        }else{
            System.out.println("ID Card is null");
        }
    }
}
