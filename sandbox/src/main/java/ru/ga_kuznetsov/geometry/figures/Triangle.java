package ru.ga_kuznetsov.geometry.figures;

import static java.lang.Math.sqrt;

public class Triangle {
    public static void printTriangleArea(double sideA, double sideB, double sideC) {
        String triangleAreaText = (String.format( "Площадь преугольника со сторонами %.2f, %.2f и %.2f равна %.2f", sideA, sideB, sideC, getTriangleArea(sideA, sideB, sideC)));
        System.out.println(triangleAreaText );
    }

    public static double getTriangleArea(double sideA, double sideB, double sideC) {
        double halfPerimeter = (sideA + sideA + sideC) / 2;
        double triangleArea = sqrt((halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC)));
        return triangleArea;
    }
    public static void printTrianglePerimeter(double sideA, double sideB, double sideC) {
        double perimeter = getTrianglePerimeter(sideA, sideB, sideC);
        String trianglePerimeterText = (String.format( "Периметр треугольника со сторонами %f, %f и %f равен %f", sideA, sideB, sideC, perimeter));

        System.out.println(trianglePerimeterText);
    }

    public static double getTrianglePerimeter(double sideA, double sideB, double sideC) {
        double perimeter = (sideA + sideB + sideC);
        return perimeter;
    }
}

