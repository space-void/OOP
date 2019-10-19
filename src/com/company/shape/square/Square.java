package com.company.shape.square;

import com.company.shape.AbstractShape;

public class Square extends AbstractShape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}