package pl.coderstrust.figure;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)

public class TriangleTest {

    @Test
    @Parameters({"2,2,2",
            "3,6,9",
            "8,8,32",
            "10,11,55",
            "1,1,0.5",})
    public void shouldCheckIfAreaOfTriangleIsCalculatedCorrectly(double inputA, double inputB, double expected) {
        //given
        Triangle triangle = new Triangle(inputA, inputB);
        //when
        double result = triangle.calculateArea();
        //then
        assertEquals(expected, result, 0.00001);
    }
}