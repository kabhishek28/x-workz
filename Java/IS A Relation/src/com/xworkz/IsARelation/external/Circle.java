package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Shape;

public class Circle extends Shape {

    public Circle(){
        System.out.println("no argument const of Circle");
    }
    @Override
    public void area() { System.out.println("@Override :Calculating area"); }
    @Override
    public void perimeter() { System.out.println("@Override :Calculating perimeter"); }
    @Override
    public void draw() { System.out.println("@Override :Drawing the shape"); }
    @Override
    public void resize() { System.out.println("@Override :Resizing the shape"); }
    @Override
    public void color() { System.out.println("@Override :Coloring the shape"); }

}
