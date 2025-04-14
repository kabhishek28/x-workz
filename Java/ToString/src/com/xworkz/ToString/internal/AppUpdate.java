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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof AppUpdate) {
                AppUpdate other = (AppUpdate) object;
                if (this.appName.equals(other.appName) &&
                        this.version.equals(other.version) &&
                        this.isMandatory == other.isMandatory) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
