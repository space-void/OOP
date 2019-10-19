package com.company;

import com.company.shape.Shape;
import com.company.shape.circle.Circle;
import com.company.shape.square.Square;
import com.company.shape.triangle.Triangle;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(5, 5);

        log.log(Level.INFO, "Area circle with radius 5 = " + circle.getArea());
        log.log(Level.INFO, "Area square with side 5 = " + square.getArea());
        log.log(Level.INFO, "Area triangle with base 5 and height 5 = " + triangle.getArea());
    }
}
