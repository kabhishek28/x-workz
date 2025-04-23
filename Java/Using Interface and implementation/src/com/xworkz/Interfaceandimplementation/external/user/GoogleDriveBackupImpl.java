package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.BackupPolicy;

public class GoogleDriveBackupImpl {
    private BackupPolicy backupPolicy;

    public GoogleDriveBackupImpl(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    public void startBackup() {
        if (backupPolicy != null) {
            backupPolicy.performBackup();
        } else {
            System.out.println("BackupPolicy is null");
        }
    }
}
