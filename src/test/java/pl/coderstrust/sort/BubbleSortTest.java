package pl.coderstrust.sort;

/**
 * Created by Adam on 2018-02-25.
 */

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertArrayEquals;


@RunWith(JUnitParamsRunner.class)
public class BubbleSortTest {

    @Parameters(method = "parametersForSortTest")
    @Test
    public void shouldSortGivenArrayOf5Elements(int[] input, int[] expected) {
        //given

        //when
        int[] result = new BubbleSort().nimNumber(input);

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
        int[] table100000 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            table100000[i] = (int) (Math.random() * 100);
        }

        List<Integer> randomTableSortedByBuildAlgoritm = Arrays.stream(table100000)
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(randomTableSortedByBuildAlgoritm);

        //when
        int[] sortedTable = new BubbleSort().nimNumber(table100000);

        List<Integer> tableSortedByBubbleSort = Arrays.stream(table100000)
                .boxed()
                .collect(Collectors.toList());

        //then
        Assert.assertEquals(randomTableSortedByBuildAlgoritm, tableSortedByBubbleSort);

    }

}