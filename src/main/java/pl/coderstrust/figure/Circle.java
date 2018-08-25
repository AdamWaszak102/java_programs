package pl.coderstrust.figure;

/**
 * Created by Adam on 2018-03-30.
 */
public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius) / 2;
    }
}

