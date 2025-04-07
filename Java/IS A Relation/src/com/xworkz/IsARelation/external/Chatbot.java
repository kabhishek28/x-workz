package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.AISystem;

public class Chatbot extends AISystem {

    public Chatbot() {
        System.out.println("No-argument constructor: Chatbot");
    }
    @Override
    public void learn() {
        System.out.println("@Override :AI System is learning from data");
    }
    @Override
    public void analyze() {
        System.out.println("@Override :AI System is analyzing patterns");
    }
    @Override
    public void respond() {
        System.out.println("@Override :AI System is generating a response");
    }
    @Override
    public void optimize() {
        System.out.println("@Override :AI System is optimizing processes");
    }
    @Override
    public void update() {
        System.out.println("@Override :AI System is updating its model");
    }

    public void chatWithUser() {
        System.out.println("Chatbot is chatting with the user");
    }

}
