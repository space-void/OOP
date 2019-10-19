package com.company.shape.square;

import com.company.shape.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void getArea() {
        Shape square = new Square(5);
        double areaSquareWithSide5 = 25;

        Assertions.assertNotNull(square);
        Assertions.assertEquals(square.getArea(), areaSquareWithSide5);
    }
}