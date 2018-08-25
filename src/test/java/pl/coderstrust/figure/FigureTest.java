package pl.coderstrust.figure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam on 2018-04-05.
 */
public class FigureTest {

    @Test
    public void shouldCheckIfAreaOfRectangleIsCalculatedCorrectly() {
        //given
        double expected = 35d;
        Figure figure = new Rectangle(5, 7);
        //when
        double result = figure.calculateArea();
        //then
        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void shouldCheckIfAreaOfSquareIsCalculatedCorrectly() {
        //given
        double expected = 25d;
        Figure figure = new Square(5);
        //when
        double result = figure.calculateArea();
        //then
        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void shouldCheckIfAreaOfTrapezoidIsCalculatedCorrectly() {
        //given
        double expected = 30d;
        Figure figure = new Trapezoid(true, 7, 5, 5);
        //when
        double result = figure.calculateArea();
        //then
        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void shouldCheckIfAreaOfTriangleIsCalculatedCorrectly() {
        //given
        double expected = 20d;
        Figure figure = new Triangle(5, 8);
        //when
        double result = figure.calculateArea();
        //then
        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void shouldCheckIfAreaOfCircleIsCalculatedCorrectly() {
        //given
        double expected = 157.07963267948966d;
        Figure figure = new Circle(10);
        //when
        double result = figure.calculateArea();
        //then
        assertEquals(expected, result, 0.00001);
    }
}


