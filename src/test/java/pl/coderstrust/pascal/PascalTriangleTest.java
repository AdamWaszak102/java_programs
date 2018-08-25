package pl.coderstrust.pascal;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam on 2018-03-04.
 */
public class PascalTriangleTest {
    @Test
    public void shouldReturnRowsForSize5() {

        // given
        List<String> expected = Arrays.asList(
                "     1 ",
                "    1 1 ",
                "   1 2 1 ",
                "  1 3 3 1 ",
                " 1 4 6 4 1 ");

        //when
        List<String> input = PascalTriangle.pascalTriangle(5);
        //then
        assertEquals(expected, input);
    }


    @Test
    public void shouldReturnRowsForSize3() {

        // given
        List<String> expected = Arrays.asList(
                "   1 ",
                "  1 1 ",
                " 1 2 1 ");

        //when
        List<String> input = PascalTriangle.pascalTriangle(3);
        //then
        assertEquals(expected, input);
    }

    @Test
    public void shouldReturnMinRowsForSize1() {

        // given
        List<String> expected = Arrays.asList(
                " 1 ");

        //when
        List<String> input = PascalTriangle.pascalTriangle(1);
        //then
        assertEquals(expected, input);
    }

}