package com.java.xworkz.CountryApplication.PersonalAssistant;

public class PersonAssistant {
    public String name;
    public String place;

    public int age;
    public int salary;
    public PersonAssistant(){
        super();
    }

    public PersonAssistant(String name,String place,int age,int salary){
        this();
        this.name = name;
        this.place = place;
        this.age = age;
        this.salary = salary;
    }


    Security security1 = new Security("Mr. Srujal Biradr","CS066","BDR01",3);
    Security security2 = new Security("Mr. Dhanajay","EC143","KAR02",5);
    Security security3 = new Security("Om prathap sing","KA420","UPO42",4);
    Security security4  = new Security("Asmith raj","GD009","BR090",3);

    Security[] securities = {security1,security2,security3,security4};

   // Personnel[] personnelss;

    public void getPersonAssistant(int i){
        System.out.println("--------PersonAssistant-----------");
        System.out.println("name :"+name);
        System.out.println("place :"+place);
        System.out.println("age :"+age);
        System.out.println("salary :"+salary);
        //System.out.println("--------------------------------------------------");
        System.out.println("----------security"+(i+1)+"------------");
        securities[i].getSecurity(i);

       ////////////////// //personnelss[i].getPersonnel();

    }


}
