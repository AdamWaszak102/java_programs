package pl.coderstrust.fibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam on 2018-02-27.
 */

@RunWith(JUnitParamsRunner.class)
public class FibonacciTest {

    @Test
    @Parameters(method = "fibonacciNumbers")
    public void shouldReturnExpectedNumberForGivenIndexIterative(int input, int expected) {
        //given

        //when
        int result = new Fibonacci().fibonacciIterative(input);
        //then
        assertEquals(expected, result);
    }

    public Object[] fibonacciNumbers() {

        //Object[] objects = {"1, 1", "3, 2", "5, 5"};
        Object[][] objects = {{1, 1}, {3, 2}, {5, 5}};

        return objects;

//        Object[] objects = new String[3];
//        objects[0] = "1, 1";
//        objects[1] = "3, 2";
//        objects[2] = "5, 5";
//        return objects;


    }

    @Test
    @Parameters(method = "fibonacciNumbers2")
    public void shouldReturnExpectedNumberForGivenIndexRecursive(int input, int expected) {
        //given

        //when
        int result = new Fibonacci().fibonacciRecursive(input);
        //then
        assertEquals(expected, result);
    }

    public Object[] fibonacciNumbers2() {

        Object[][] objects = {{1, 1}, {3, 2}, {5, 5}};

        return objects;

    }


}