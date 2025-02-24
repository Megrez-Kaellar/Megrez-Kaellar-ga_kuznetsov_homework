package ru.ga_kuznetsov.geometry.figures;

import static java.lang.Math.PI;


public class Circle {
    public static void printCircleSquare (double radius){
        double circleSquare = PI * (radius * radius);
        System.out.println("Площадь круга при радиусе " + radius + " равна" + " " + circleSquare);
    }
    public static void printCirclePerimeter (double radius) {
        double circlePerimeter = 2 * PI * radius;
        System.out.println("Длина окружности при радиусе " + radius + " " + "равна" + " " + circlePerimeter);
    }
}
