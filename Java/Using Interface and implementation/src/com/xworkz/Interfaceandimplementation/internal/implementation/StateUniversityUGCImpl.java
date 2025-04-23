package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.UGC;

public class StateUniversityUGCImpl implements UGC {
    public StateUniversityUGCImpl() {
        System.out.println("StateUniversityUGCImpl const");
    }

    @Override
    public void conductExams() {
        System.out.println("Conduct method in StateUniversityUGCImpl class");
    }
}
