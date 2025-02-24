package ru.ga_kuznetsov.geometry.figures;

import static java.lang.Math.sqrt;

public class Triangle {
    public static void printTriangleSquare(double sideA, double sideB, double sideC) {

        double halfPerimeter = (sideA + sideA + sideC) / 2;

        double triangleSquare = sqrt((halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC)));

        String triangleSquareText = (String.format( "Площадь преугольника со сторонами %f, %f и %f равна %f", sideA, sideB, sideC, triangleSquare));


        System.out.println(triangleSquareText );
    }

    public static void printTrianglePerimeter(double sideA, double sideB, double sideC) {
        double perimeter = (sideA + sideA + sideC);
        String trianglePerimeterText = (String.format( "Периметр треугольника со сторонами %f, %f и %f равен %f", sideA, sideB, sideC, perimeter));

        System.out.println(trianglePerimeterText);
    }
}

