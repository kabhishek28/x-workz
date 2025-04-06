package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Borad;

public class MotherBorad extends Borad {
    public MotherBorad(){
        System.out.println("no parameter Mother Borad");
    }

@Override
    public void noOFItem(){
        System.out.println("@Override :NO OF Item used");
    }
    @Override
    public void voltage(){
        System.out.println("@Override :Voltage ");
    }
    @Override
    public void current(){
        System.out.println("@Override :current");
    }
    @Override
    public void size(){
        System.out.println("@Override :size");
    }
    @Override
    public void configure(){
        System.out.println("@Override :configure");
    }
}
