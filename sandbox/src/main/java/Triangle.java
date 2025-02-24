
import static java.lang.Math.sqrt;

public class Triangle {
    public static void main(String[] args) {
        printTriangleSquare(2, 2, 3);
    }

    private static void printTriangleSquare(double sideA, double sideB, double sideC) {

        double halfPerimeter = (sideA + sideA + sideC) /2;

        double triangleSquare = sqrt((halfPerimeter * (halfPerimeter - sideA ) * (halfPerimeter - sideB) * (halfPerimeter - sideC)));

        System.out.println("Площадь преугольника со сторонами " + sideA +", "+ sideB +", "+ sideC + " = " + triangleSquare );
    }
}
