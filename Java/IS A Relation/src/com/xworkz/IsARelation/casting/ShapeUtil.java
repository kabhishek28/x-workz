package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Circle;
import com.xworkz.IsARelation.internal.Shape;

public class ShapeUtil {

        public ShapeUtil() {
            System.out.println("ShapeUtil constructor is running");
        }

        public void getShape(Shape shape) {
            if (shape != null) {
                shape.area();
                shape.perimeter();
                shape.draw();
                shape.resize();
                shape.color();

                if (shape instanceof Circle) {
                    Circle circle = (Circle) shape;
                    circle.calculateDiameter();
                } else {
                    System.out.println("shape is not an instance of Circle");
                }
            }
        }


}
