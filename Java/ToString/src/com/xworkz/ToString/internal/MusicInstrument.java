package com.xworkz.ToString.internal;

public class MusicInstrument {
    private String name;
    private String type;
    private boolean isElectronic;

    public MusicInstrument(String name, String type, boolean isElectronic) {
        this.name = name;
        this.type = type;
        this.isElectronic = isElectronic;
    }

    @Override
    public String toString() {
        return "Instrument: " + name + ", Type: " + type + ", Electronic: " + isElectronic;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}
