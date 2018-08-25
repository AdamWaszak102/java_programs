package pl.coderstrust.figure;

/**
 * Created by Adam on 2018-03-30.
 */
public class Trapezoid implements Figure {

    private boolean appropriate;
    private double sideA;
    private double sideB;
    private double sideH;

    public Trapezoid(boolean appropriate, double sideA, double sideB, double sideH) {
        this.appropriate = appropriate;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    @Override
    public double calculateArea() {
        if (!appropriate)
            System.out.println("It is impossible to calculate the surface area.");
        else
            return (((sideA + sideB) * sideH) / 2);
        return 0;
    }
}
