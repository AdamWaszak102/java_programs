package pl.coderstrust.numbersFromFile;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Adam on 2018-04-09.
 */

@RunWith(JUnitParamsRunner.class)
public class NumbersProcessorTest {

    @Test
    @Parameters({"10  40  34, 10+40+34=84",
            " 1 11 101 1001 10001 , 1+11+101+1001+10001=11115",
            "3    57          20, 3+57+20=80",
            "13  13, 13+13=26",
            "6 6  6   6    6     6, 6+6+6+6+6+6=36",})

    public void shouldCheckIfProgramShowsCorrectFile(String input, String valid) throws
            Exception {
        //given

        //when
        String result = new NumbersProcessor().processLine(input);
        //then
        assertThat(result, is(valid));

    }

}