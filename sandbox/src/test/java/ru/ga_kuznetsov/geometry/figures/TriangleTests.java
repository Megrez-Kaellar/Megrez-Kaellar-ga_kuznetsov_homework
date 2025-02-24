package ru.ga_kuznetsov.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void canCalculateTriangleArea(){
        var result = Triangle.getTriangleSquare( 5, 5, 5);
        Assertions.assertEquals(10.825317547305483, result);
    };
    @Test
    void canCalculateTrianglePerimeter() {
        double result = Triangle.getTrianglePerimeter(5, 5, 5);
        Assertions.assertEquals(15, result);
    }

}
