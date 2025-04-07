package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.MusicalInstrument;

public class Guitar extends MusicalInstrument {
    public Guitar(){
        System.out.println("no argument const of Guitar");
    }

@Override
    public void play() { System.out.println("@Override ;Playing instrument"); }
    @Override
    public void tune() { System.out.println("@Override :Tuning instrument"); }
    @Override
    public void maintain() { System.out.println("@Override :Maintaining instrument"); }
    @Override
    public void transport() { System.out.println("@ Override :Transporting instrument"); }
    @Override
    public void store() { System.out.println("@Override :Storing instrument"); }
    public void showGuitarType() {
        System.out.println("This is an acoustic guitar.");
    }

}
