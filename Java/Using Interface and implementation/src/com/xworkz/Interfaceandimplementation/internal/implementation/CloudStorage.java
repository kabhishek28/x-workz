package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.BackupPolicy;

public class CloudStorage implements BackupPolicy {
    @Override
    public void performBackup() {
        System.out.println("Cloud storage service is performing backup.");
    }
}
