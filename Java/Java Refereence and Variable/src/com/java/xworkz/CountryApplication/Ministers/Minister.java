package com.java.xworkz.CountryApplication.Ministers;

public class Minister {
    public String name ;
    public String department;
    public int age;
    public String party;



    public Minister(String name,int age,String department,String party){
        this.name = name;
        this.age = age;
        this.department = department;
        this.party = party;
    }

    public void getMinister(int i){
        //System.out.println("**********************MINISTER***********************");
        System.out.println("Minister name :"+this.name);
        System.out.println("Minister age :"+this.age);
        System.out.println("Minister Department :"+this.department);
        System.out.println("Minister party :"+this.party);
        //System.out.println("------------------------------------");
    }

}
