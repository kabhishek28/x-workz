package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.HealthRegulation;

public class ApolloHospitalImpl {
    private HealthRegulation regulation;

    public ApolloHospitalImpl(HealthRegulation regulation) {
        this.regulation = regulation;
    }

    public void auditSanitation() {
        if (regulation != null) {
            regulation.followSanitationRules();
        } else {
            System.out.println("HealthRegulation is null");
        }
    }
}
