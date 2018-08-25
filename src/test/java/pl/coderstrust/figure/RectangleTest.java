package pl.coderstrust.figure;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RectangleTest {

    @Test
    @Parameters({"2,2,4",
            "3,6,18",
            "2.25,3.72,8.37",
            "8.11,6.12,49.6332",
            "1,1,1",})
    public void shouldCheckIfAreaOfRectangleIsCalculatedCorrectly(double inputA, double inputB, double expected) {
        //given
        Rectangle rectangle = new Rectangle(inputA, inputB);
        //when
        double result = rectangle.calculateArea();
        //then
        assertEquals(expected, result, 0.00001);
    }
}