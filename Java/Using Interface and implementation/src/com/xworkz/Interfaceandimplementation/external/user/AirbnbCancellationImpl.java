package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.CancellationPolicy;

public class AirbnbCancellationImpl {
    private CancellationPolicy cancellationPolicy;

    public AirbnbCancellationImpl(CancellationPolicy cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public void processCancellation() {
        if (cancellationPolicy != null) {
            cancellationPolicy.handleCancellation();
        } else {
            System.out.println("CancellationPolicy is null");
        }
    }
}
