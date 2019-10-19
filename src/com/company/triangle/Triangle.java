package com.company.triangle;

import com.company.AbstractShape;

public class Triangle extends AbstractShape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * 0.5 * height;
    }
}