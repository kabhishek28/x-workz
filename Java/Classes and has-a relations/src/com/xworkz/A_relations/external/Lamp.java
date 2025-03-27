package com.xworkz.A_relations.external;

import com.xworkz.A_relations.internal.Warranty;




public class Lamp {

    public String design ;
    public String type;

    Warranty warranty = new Warranty();

    public Lamp(String design,String type){
        this.design=design;
        this.type=type;
    }

    public void getLamp(){
        System.out.println("design of the Lamp :"+this.design);
        System.out.println("Type of the Lamp :"+this.type);
    }

    public void getWarranty(){
        warranty.setStartDate("28 Mar 2025");
        warranty.setEndDate("28 Mar 2026");
        System.out.println("Warranty Start Date :"+warranty.getStartDate());
        System.out.println("Warranty End Date :"+warranty.getEndDate());
    }
}
