package pl.coderstrust.sort;

/**
 * Created by Adam on 2018-02-25.
 */

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnitParamsRunner.class)
public class SelectionSortSortTest {

    @Parameters(method = "parametersForSortTest")
    @Test
    public void shouldSortGivenArrayOf5Elements(int[] input, int[] expected) {
        //given

        //when
        int[] result = new SelectionSortSort().sort(input);

        //then
        assertArrayEquals(expected, result);

    }

    public Object parametersForSortTest() {
        return new Object[]{
                $(new int[]{1, 2, 3, 4, 5},
                        new int[]{1, 2, 3, 4, 5}),
                $(new int[]{5, 4, 3, 2, 1},
                        new int[]{1, 2, 3, 4, 5}),
                $(new int[]{6, 4, 7, 2, 1},
                        new int[]{1, 2, 4, 6, 7}),
        };
    }

    @Test
    public void shouldSortRandomTableOf100000Elements() {

        //given
        int[] randomTable = new int[100000];
        for (int i = 0; i < 100000; i++) {
            randomTable[i] = (int) (Math.random() * 100);
        }


        //when
        int[] sorted = new SelectionSortSort().sort(randomTable);


        //then

        for (int i = 0; i < 10000 - 1; i++) {
            Assert.assertTrue(sorted[i] <= sorted[i + 1]);
        }
    }


}