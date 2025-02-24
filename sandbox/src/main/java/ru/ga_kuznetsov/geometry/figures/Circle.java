package ru.ga_kuznetsov.geometry.figures;

import static java.lang.Math.PI;


public class Circle {
    public static void printCircleSquare (double radius){
        System.out.printf("Площадь круга при радиусе %f равна %f%n",radius, getCirclePerimeter(radius));
    }

    private static double getCircleSquare(double radius) {
        double circleSquare = PI * (radius * radius);
        return circleSquare;
    }

    public static void printCirclePerimeter (double radius) {
        System.out.printf("Длина окружности при радиусе %f равна %f", radius, getCirclePerimeter(radius));
    }

    private static double getCirclePerimeter(double radius) {
        double circlePerimeter = 2 * PI * radius;
        return circlePerimeter;
    }
}
