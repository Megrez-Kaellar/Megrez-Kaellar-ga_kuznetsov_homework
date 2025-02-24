import static java.lang.Math.sqrt;

public class Triangle {
    static void printTriangleSquare(double sideA, double sideB, double sideC) {

        double halfPerimeter = (sideA + sideA + sideC) / 2;

        double triangleSquare = sqrt((halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC)));

        System.out.println("Площадь преугольника со сторонами " + sideA + ", " + sideB + ", " + sideC + " = " + triangleSquare);
    }

    static double printTrianglePerimeter(double sideA, double sideB, double sideC) {
        double perimeter = (sideA + sideA + sideC);
        System.out.println("Периметр треугольника со сторонами " + sideA + ", " + sideB + ", " + sideC + " =" + perimeter);
        return perimeter;
    }
}

