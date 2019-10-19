package com.company.shape.circle;

import com.company.shape.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void getArea() {
        Shape circle = new Circle(5);
        double areaCircleWithRadius5 = 78.53981633974483;

        Assertions.assertNotNull(circle);
        Assertions.assertEquals(circle.getArea(), areaCircleWithRadius5);
    }
}