package com.company.shape.circle;

import com.company.shape.AbstractShape;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
