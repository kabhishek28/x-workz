package com.xworkz.ToString.internal;

public class AIModel {
    private String modelName;
    private String version;
    private String purpose;

    public AIModel(String modelName, String version, String purpose) {
        this.modelName = modelName;
        this.version = version;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "AI Model: " + modelName + ", Version: " + version + ", Purpose: " + purpose;
    }


    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof AIModel) {
                AIModel other = (AIModel) object;
                if (this.modelName.equals(other.modelName) &&
                        this.version.equals(other.version)) {
                    return true;
                }
            }
        }
        return false;
    }
}

