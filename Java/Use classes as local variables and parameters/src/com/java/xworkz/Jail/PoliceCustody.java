package com.java.xworkz.Jail;

public class PoliceCustody {
    public void getJail(Jail jail){
        if(jail != null){
            System.out.println("Here All set method is called");
//            //jail.setName("Om pratap sing");
//            jail.setJailerName("Achinthhhhhhhhhhhhhh" );
//            //jail.setLocation("UP");
//            //jail.setTotalCells(4);

            System.out.println("Here all get method is called");
            System.out.println("this single instances");
            System.out.println("Name :"+jail.getName());
            System.out.println("Jailer Name :"+jail.getJailerName());
            System.out.println("Location :"+jail.getLocation());
            System.out.println("Total Cells :"+jail.getTotalCells());
        }else {
            System.out.println("jail is null");
        }

    }


    public void getjails(Jail[] jails) {
        if (jails != null) {
            for (Jail ref : jails) {
                System.out.println("this array of different instances");
                System.out.println("Name :"+ref.getName());
                System.out.println("Jailer Name :"+ref.getJailerName());
                System.out.println("Location :"+ref.getLocation());
                System.out.println("Total Cells :"+ref.getTotalCells());
            }
        }else{
            System.out.println("jails are nulll");
        }

    }

}
