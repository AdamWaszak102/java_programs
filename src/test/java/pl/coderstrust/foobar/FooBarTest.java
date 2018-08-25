package pl.coderstrust.foobar;

/**
 * Created by Adam on 2018-02-25.
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FooBarTest {

    @Test
    public void shouldCheckIfFooBarShowsCorrectStringFor5() {
        //given
        String expected = "5 Bar";

        //when
        List<String> input = FooBar.pressFoobar();

        //then
        Assert.assertEquals(expected, input.get(5));
    }

    @Test
    public void shouldCheckIfFooBarShowsCorrectStringFor21() {
        //given
        String expected = "21 Foo";

        //when
        List<String> input = FooBar.pressFoobar();

        //then
        Assert.assertEquals(expected, input.get(21));
    }

    @Test
    public void shouldCheckIfFooBarShowsCorrectStringFor95() {
        //given
        String expected = "75 FooBar";

        //when
        List<String> input = FooBar.pressFoobar();

        //then
        Assert.assertEquals(expected, input.get(75));
    }

    @Test
    public void shouldCheckIfFooBarGenerate100Numbers() {
        //given
        int expectedLength = 101;

        //when
        List<String> input = FooBar.pressFoobar();

        //then
        Assert.assertEquals(expectedLength, input.size());
    }
}