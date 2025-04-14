package com.xworkz.ToString.internal;

public class TheatreShow {
    private String showName;
    private String language;
    private String time;

    public TheatreShow(String showName, String language, String time) {
        this.showName = showName;
        this.language = language;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Show: " + showName + ", Language: " + language + ", Time: " + time;
    }

    @Override
    public int hashCode(){
        return 4;
    }
    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof TheatreShow) {
                TheatreShow other = (TheatreShow) object;
                if (this.showName.equals(other.showName) &&
                        this.language.equals(other.language)) {
                    return true;
                }
            }
        }
        return false;
    }
}
