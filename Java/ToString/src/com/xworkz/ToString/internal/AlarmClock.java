package com.xworkz.ToString.internal;

public class AlarmClock {
    private String time;
    private boolean isAM;
    private boolean isActive;

    public AlarmClock(String time, boolean isAM, boolean isActive) {
        this.time = time;
        this.isAM = isAM;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Alarm Set For: " + time + (isAM ? " AM" : " PM") + ", Active: " + isActive;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof AlarmClock) {
                AlarmClock other = (AlarmClock) object;
                if (this.time.equals(other.time) &&
                        this.isAM == other.isAM) {
                    return true;
                }
            }
        }
        return false;
    }
}
