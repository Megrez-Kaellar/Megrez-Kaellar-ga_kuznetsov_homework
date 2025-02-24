package ru.ga_kuznetsov.geometry.figures;

import static java.lang.Math.sqrt;

public class Triangle {
    public static void printTriangleSquare(double sideA, double sideB, double sideC) {
        String triangleSquareText = (String.format( "Площадь преугольника со сторонами %f, %f и %f равна %f", sideA, sideB, sideC, getTriangleSquare(sideA, sideB, sideC)));
        System.out.println(triangleSquareText );
    }

    public static double getTriangleSquare(double sideA, double sideB, double sideC) {
        double halfPerimeter = (sideA + sideA + sideC) / 2;
        double triangleSquare = sqrt((halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC)));
        return triangleSquare;
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

