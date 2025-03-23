package com.java.xworkz.CountryApplication.PersonalAssistant;

public class Personnel {

    String name;
    int age;
    String rank;
    boolean isTrained;

    Personnel(String name,int age,String rank,Boolean isTrained){
        this.name = name;
        this.age =age;
        this.rank = rank;
        this.isTrained = isTrained;
    }


    Skill skill1 =  new Skill(new String[]{"Advanced Driving","Close Protection","First Aid Training"}, 8,true,new String[]{"English", "Hindi"});
    Skill skill2 = new Skill(new String[]{"First Aid Training", "Advanced Driving", "Emergency Response"}, 5, false, new String[]{"English", "hindi","telugu"});
    Skill skill3 = new Skill(new String[]{"VIP Protection", "Close Protection", "Tactical Training"}, 12, true, new String[]{"English", "German", "French"});
    Skill skill4 = new Skill(new String[]{"Weapons Training", "Close Protection", "Surveillance Operations"}, 6, true, new String[]{"English", "Arabic"});



        Skill[] skills = {skill1,skill2,skill3,skill4};


    void getPersonnel(int i){
        System.out.println("------------Personnel--------------");
        System.out.println("Security Personnel name :"+name);
        System.out.println("Security Personnel age :"+age);
        System.out.println("Security Personnel rank :"+rank);
        System.out.println("Security Personnel isTrained :"+isTrained);
        skills[i].getSkill(name,i);






    }

}
