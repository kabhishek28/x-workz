package com.java.xworkz.Idcard;

public class CompanyRunner {
    public static void main(String[] args) {

        IDCard idCard = new IDCard();
        idCard.setMaterial("Metal");
        //String[] colors = {};
        idCard.setColors(new String[] {"red","black","blue","white","yellow"});
        idCard.setWeight(25);
        idCard.setDesignedBy("Srujal");

        IDCard idCard1 = new IDCard();
        idCard1.setMaterial("plastic");
        String[] colors = {"black","pink","orange"};
        idCard.setColors(colors);
        //idCard.setColors(new String[] {"red","black","blue","white","yellow"});
        idCard.setWeight(10);
        idCard.setDesignedBy("Dhanu");

        IDCard idCard2 = new IDCard();
        idCard2.setMaterial("fiber");
        idCard2.setColors(new String[] {"yellow","red","white"});
        idCard2.setWeight(30);
        idCard2.setDesignedBy("Sujay");

        IDCard[] idCards = {idCard,idCard1,idCard2};


        Company company = new Company();
        company.getIDCard(idCards);
    }


}
