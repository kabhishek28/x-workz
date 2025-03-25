package com.java.xworkz.Alien;

public class Information {
    public void getAlien(Alien[] aliens){
        if(aliens != null){
            for(Alien ref:aliens){
                System.out.println("-------------Alien-------------");
                System.out.println("Seen By :"+ref.getSeenBy());
                System.out.println("Seen Date :"+ref.getSeenDate());
                System.out.println("Describe :"+ref.getDescribe());
            }
        }else{
            System.out.println("aliens is null");
        }
    }
}
