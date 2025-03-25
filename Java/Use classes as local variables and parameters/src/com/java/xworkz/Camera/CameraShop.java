package com.java.xworkz.Camera;

public class CameraShop {
    public void getCamera(Camera[] cameras){
        if(cameras != null){
            for(Camera ref:cameras){
                System.out.println("-------CAMERA----------");
                System.out.println("Brand :"+ref.getBrand());
                System.out.println("Price :"+ref.getPrice());
                System.out.println("Type :"+ref.getType());
                System.out.println("Connectivity :"+ref.getConnectivity());
            }
        }
        else{
            System.out.println("Camera is null");
        }

    }
}
