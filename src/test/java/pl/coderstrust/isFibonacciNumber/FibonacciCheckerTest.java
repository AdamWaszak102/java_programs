package pl.coderstrust.isFibonacciNumber;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam on 2018-03-21.
 */
@RunWith(JUnitParamsRunner.class)
public class FibonacciCheckerTest {

    @Parameters(method = "parametersFibonacciCheckerTest")
    @Test
    public void shouldCheckIfProgramShowsCorrectValueForFirstFibonacciNumber(int input, boolean expected) {
        //given

        //when
        boolean result = new FibonacciChecker().isFibonacciNumber(input);
        //isFibonacci(input);

        //then
        assertEquals(expected, result);
    }

    public Object parametersFibonacciCheckerTest() {
        return Arrays.asList(new Object[][]{
                {832040, true},
                {22, false},
                {514229, true},
                {79, false},
                {100, false}
        });

    }
}

