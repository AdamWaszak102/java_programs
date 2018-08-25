package pl.coderstrust.sieve;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Adam on 2018-03-08.
 */

@RunWith(JUnitParamsRunner.class)
public class SieveOfEratosthenesTest {

    @Parameters(method = "parametersSieveOfEratostheneTest")
    @Test
    public void shouldCalculateArrayOfSieveOfEratosthenesTillProvidedValue(int size, int[] expected) {
        //given

        //when
        int[] array = SieveOfEratosthenes.sieveOfEratosthenes(size);

        //then
        assertArrayEquals(expected, array);
    }

    private Object parametersSieveOfEratostheneTest() {
        return
                new Object[]{
                        new Object[]{
                                30, new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29}
                        },
                        new Object[]{
                                100, new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
                                71, 73, 79, 83,
                                89, 97}
                        },
                        new Object[]{
                                12, new int[]{2, 3, 5, 7, 11}
                        },
                        new Object[]{
                                70, new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67}
                        },
                        new Object[]{
                                120, new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
                                71, 73, 79, 83,
                                89, 97, 101, 103, 107, 109, 113}
                        },
                        new Object[]{
                                0, new int[]{}
                        },
                };
    }
}