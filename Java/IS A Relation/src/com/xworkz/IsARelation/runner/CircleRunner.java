package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Circle;
import com.xworkz.IsARelation.internal.Shape;

public class CircleRunner {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.area();
        shape1.draw();
        shape1.color();
        shape1.perimeter();
        shape1.resize();
        System.out.println("-----------------------");
        Circle circle = new Circle();
        circle.area();
        circle.draw();
        circle.color();
        circle.perimeter();
        circle.resize();
        System.out.println("-----------------------");
        Shape shape = new Circle();
        shape.area();
        shape.draw();
        shape.color();
        shape.perimeter();
        shape.resize();
    }
}
