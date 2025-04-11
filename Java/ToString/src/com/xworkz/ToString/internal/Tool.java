package com.xworkz.ToString.internal;

public class Tool {
    private String name;
    private String type;
    private boolean isElectric;

    public Tool(String name, String type, boolean isElectric) {
        this.name = name;
        this.type = type;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Tool: " + name + ", Type: " + type + ", Electric: " + isElectric;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}
