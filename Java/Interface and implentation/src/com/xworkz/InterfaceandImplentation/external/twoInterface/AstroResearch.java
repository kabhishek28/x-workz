package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.SpaService;
import com.xworkz.InterfaceandImplentation.RulesClass.Telemedicine;

import javax.management.relation.RelationServiceMBean;

public class AstroResearch implements SpaService, Telemedicine {

    @Override
    public void bookAppointment() {
        System.out.println("book");
    }

    @Override
    public void provideService() {

    }

    @Override
    public void collectFeedback() {

    }

    @Override
    public void scheduleConsultation() {

    }

    @Override
    public void conductVideoCall() {

    }

    @Override
    public void transmitMedicalRecords() {

    }
}
