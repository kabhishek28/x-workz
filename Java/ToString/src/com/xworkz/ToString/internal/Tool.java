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

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Tool) {
                Tool other = (Tool) object;
                if (this.name.equals(other.name) &&
                        this.type.equals(other.type) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
