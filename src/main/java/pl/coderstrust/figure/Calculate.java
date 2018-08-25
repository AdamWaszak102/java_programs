package pl.coderstrust.figure;

/**
 * Created by Adam on 2018-03-30.
 */
public class Calculate {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(20, 30);
        System.out.println(rectangle.calculateArea());

        Square square = new Square(5);
        System.out.println(square.calculateArea());

        Triangle triangle = new Triangle(20, 20);
        System.out.println(triangle.calculateArea());

        Circle circle = new Circle(10);
        System.out.println(circle.calculateArea());

        Trapezoid trapezoid = new Trapezoid(true, 20, 30, 40);
        System.out.println(trapezoid.calculateArea());
    }
}
