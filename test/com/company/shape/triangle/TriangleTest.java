package com.company.shape.triangle;

import com.company.shape.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getArea() {
        Shape triangle = new Triangle(5, 5);
        double areaTriangleWithBase5Height5 = 12.5;

        Assertions.assertNotNull(triangle);
        Assertions.assertEquals(triangle.getArea(), areaTriangleWithBase5Height5);
    }
}