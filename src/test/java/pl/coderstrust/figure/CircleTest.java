package pl.coderstrust.figure;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CircleTest {

    @Test
    @Parameters({"5,39.269908169872416",
            "7,76.96902001294993",
            "2,6.283185307179586",
            "8,100.53096491487338",
            "10,157.07963267948966",})
    public void shouldCheckIfAreaOfCircleIsCalculatedCorrectly(double inputA, double expected) {
        //given
        Circle circle = new Circle(inputA);

        //when
        double result = circle.calculateArea();

        //then
        assertEquals(expected, result, 0.000000000000001);
    }
}