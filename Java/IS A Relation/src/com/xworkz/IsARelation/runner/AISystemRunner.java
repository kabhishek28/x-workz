package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Chatbot;
import com.xworkz.IsARelation.internal.AISystem;

public class AISystemRunner {
    public static void main(String[] args) {
        AISystem aiSystem1 =new AISystem();
        aiSystem1.learn();
        aiSystem1.analyze();
        aiSystem1.respond();
        aiSystem1.optimize();
        aiSystem1.update();
        System.out.println("---------------");
        AISystem ai = new Chatbot();
        ai.learn();
        ai.analyze();
        ai.respond();
        ai.optimize();
        ai.update();

        System.out.println("******************");

        Chatbot chatbot = new Chatbot();
        chatbot.learn();
        chatbot.analyze();
        chatbot.respond();
        chatbot.optimize();
        chatbot.update();
    }
}
