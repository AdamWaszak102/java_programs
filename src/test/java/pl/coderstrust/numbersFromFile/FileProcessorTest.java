package pl.coderstrust.numbersFromFile;

/**
 * Created by Adam on 2018-04-09.
 */

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileProcessorTest {

    @Test
    public void shouldCheckIfProgramWriteNumbersCorrectly() throws IOException {
        //given
        FileProcessor fileProcessor = new FileProcessor();
        List<String> expected = Arrays.asList("abcderfg", "1234567");

        //when
        fileProcessor.writeLinesToFile(expected, "src/test/resources/input_for_fileProcessor_test2.txt");
        List<String> result = fileProcessor.readLinesFromFile("src/test/resources/output_for_fileProcessor_test.txt");

        //then
        Assert.assertEquals(expected, result);
    }

}