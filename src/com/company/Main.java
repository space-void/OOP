package com.company;

import com.company.circle.Circle;
import com.company.square.Square;
import com.company.triangle.Triangle;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Shape circle = new Circle(5.0);
        System.out.println(circle.getArea());

        Shape square = new Square(5.0);
        System.out.println(square.getArea());

        Shape triangle = new Triangle(5.0, 5.0);
        System.out.println(triangle.getArea());
    }
}
