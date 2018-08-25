package pl.coderstrust.figure;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TrapezoidTest {

    @Test
    @Parameters({"true,2,4,2,6",
            "true,6,18,3,36",
            "true,8,8,8,64",
            "true,5,5,5,25",
            "true,1,1,1,1",})

    public void shouldCheckIfAreaOfTrapezoidIsCalculatedCorrectly(boolean inputA, double inputB, double inputC, double
            inputD, double expected) {
        //given
        Trapezoid trapezoid = new Trapezoid(inputA, inputB, inputC, inputD);
        //when
        double result = trapezoid.calculateArea();
        //then
        assertEquals(expected, result, 0.00001);
    }
}