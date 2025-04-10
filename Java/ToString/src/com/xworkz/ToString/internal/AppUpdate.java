package com.xworkz.ToString.internal;

public class AppUpdate {
    private String appName;
    private String version;
    private boolean isMandatory;

    public AppUpdate(String appName, String version, boolean isMandatory) {
        this.appName = appName;
        this.version = version;
        this.isMandatory = isMandatory;
    }

    @Override
    public String toString() {
        return "App: " + appName + ", Version: " + version + ", Mandatory Update: " + isMandatory;
    }
}

    // Runner
