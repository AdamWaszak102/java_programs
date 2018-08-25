package pl.coderstrust.figure;

/**
 * Created by Adam on 2018-03-30.
 */
public class Triangle implements Figure {

    private double sideA;
    private double sideH;

    public Triangle(double sideA, double sideH) {
        this.sideA = sideA;
        this.sideH = sideH;
    }

    @Override
    public double calculateArea() {
        return (sideA * sideH) / 2;
    }
}
