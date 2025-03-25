package com.java.xworkz.Jail;

public class policeCustodyRunner {
    public static void main(String[] args) {

        PoliceCustody policeCustody = new PoliceCustody();
        Jail jail = new Jail();
        jail.setName("Om prathapaaaaaaaaaa ");
        jail.setLocation("UPaaaaaaaaaa");
        jail.setJailerName("Achinth AnnAaaaaaaaaaaaaaaaa");
        jail.setTotalCells(40);
        policeCustody.getJail(jail);




        Jail jail1 = new Jail();
        jail1.setName("Dhanu");
        jail1.setLocation("AP");
        jail1.setJailerName("Srujal");
        jail1.setTotalCells(3);



        Jail jail2 = new Jail();
        jail2.setName("Sujay ");
        jail2.setLocation("Durga");
        jail2.setJailerName("Akashya");
        jail2.setTotalCells(55);




        Jail jail3 = new Jail();
        jail3.setName("Anusha ");
        jail3.setLocation("kerala");
        jail3.setJailerName("Sinchana");
        jail3.setTotalCells(40);

        Jail[] jails = {jail1,jail2,jail3};

        policeCustody.getjails(jails);


    }
}
