package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Painter;
import com.xworkz.IsARelation.internal.Artist;

public class PainterRunner {
    public static void main(String[] args) {

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
