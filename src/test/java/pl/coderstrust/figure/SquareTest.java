package pl.coderstrust.figure;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SquareTest {

    @Test
    @Parameters({"2,4",
            "3,9",
            "8,64",
            "10,100",
            "1,1",})
    public void shouldCheckIfAreaOfSquareIsCalculatedCorrectly(int inputA, double expected) {
        //given
        Square square = new Square(inputA);
        //when
        double result = square.calculateArea();
        //then
        assertEquals(expected, result, 0.00001);
    }
}