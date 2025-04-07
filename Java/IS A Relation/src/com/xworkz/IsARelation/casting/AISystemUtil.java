package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Chatbot;
import com.xworkz.IsARelation.internal.AISystem;

public class AISystemUtil {


        public AISystemUtil() {
            System.out.println("AISystemUtil constructor is running");
        }

        public void getAISystem(AISystem aiSystem) {
            if (aiSystem != null) {
                aiSystem.learn();
                aiSystem.analyze();
                aiSystem.respond();
                aiSystem.optimize();
                aiSystem.update();

                if (aiSystem instanceof Chatbot) {
                    Chatbot chatbot = (Chatbot) aiSystem;
                    chatbot.chatWithUser();
                } else {
                    System.out.println("aiSystem is not an instance of Chatbot");
                }
            }
        }
    }


