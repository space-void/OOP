package com.company.square;

import com.company.AbstractShape;

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