package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.ChatBot;
import com.xworkz.InterfaceandImplentation.RulesClass.Robot;

public class RoboAssistant implements Robot, ChatBot {
    @Override public void move() { System.out.println("RoboAssistant moving to user location."); }
    @Override public void pickObject() { System.out.println("RoboAssistant picking up an object."); }
    @Override public void recharge() { System.out.println("RoboAssistant charging battery."); }
    @Override public void receiveMessage() { System.out.println("RoboAssistant received a message."); }
    @Override public void processMessage() { System.out.println("RoboAssistant processing user message."); }
    @Override public void sendResponse() { System.out.println("RoboAssistant sending a reply."); }
}