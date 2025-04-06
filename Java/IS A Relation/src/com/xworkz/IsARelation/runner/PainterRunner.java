package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Painter;
import com.xworkz.IsARelation.internal.Artist;

public class PainterRunner {
    public static void main(String[] args) {
        Artist artist1 = new Artist();
        artist1.createArt();
        artist1.displayArt();
        artist1.getInspired();
        artist1.sellArt();
        artist1.useMaterials();

        System.out.println("******************");

        Artist artist = new Painter();
        artist.createArt();
        artist.displayArt();
        artist.getInspired();
        artist.sellArt();
        artist.useMaterials();

        System.out.println("******************");


        Painter painter = new Painter();
        painter.createArt();
        painter.displayArt();
        painter.getInspired();
        painter.sellArt();
        painter.useMaterials();
    }
}
