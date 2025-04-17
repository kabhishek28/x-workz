package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.ChatBot;

public class VirtualAssistant implements ChatBot {
    @Override
    public void receiveMessage() {
        System.out.println("VirtualAssistant received a user message.");
    }

    @Override
    public void processMessage() {
        System.out.println("VirtualAssistant processing the message content.");
    }

    @Override
    public void sendResponse() {
        System.out.println("VirtualAssistant sending a response back to the user.");
    }
}