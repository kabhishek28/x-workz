package com.xworkz.IsARelation.external;
import com.xworkz.IsARelation.internal.Artist;

public class Painter extends Artist {

        public Painter() {
            System.out.println("No-argument constructor: Painter");
        }

@Override
    public void createArt() {
        System.out.println("@Override :Artist is creating art...");
    }
    @Override
    public void sellArt() {
        System.out.println("@Override :Artist is selling artwork...");
    }
    @Override
    public void displayArt() {
        System.out.println("@Override :Artist is displaying artwork...");
    }
    @Override
    public void useMaterials() {
        System.out.println("@Override :Artist is using materials to create...");
    }
    @Override
    public void getInspired() {
        System.out.println("@Override :Artist is getting inspired...");
    }

}
