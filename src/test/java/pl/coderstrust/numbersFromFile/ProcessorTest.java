package pl.coderstrust.numbersFromFile;

/**
 * Created by Adam on 2018-04-09.
 */

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class ProcessorTest {

    @Test
    public void checkingIfProcessorWorks() throws IOException {

        // given
        FileProcessor fileProcessor = mock(FileProcessor.class);
        NumbersProcessor numbersProcessor = mock(NumbersProcessor.class);
        Processor processor = new Processor(numbersProcessor, fileProcessor);

        String inputFile = "fileNameMockito.txt";
        String outputFile = "outputMockito.txt";
        String input116 = "1 1 6";
        String input3045 = "3 0 4 5";
        String output116 = "1+1+6=8";
        String output3045 = "3+0+4+5=12";
        List processed = Arrays.asList(output116, output3045);

        when(fileProcessor.readLinesFromFile(inputFile)).thenReturn(Arrays.asList(input116, input3045));
        when(numbersProcessor.processLine(input116)).thenReturn(output116);
        when(numbersProcessor.processLine(input3045)).thenReturn(output3045);

        // when
        processor.process(inputFile, outputFile);

        // then
        verify(fileProcessor).readLinesFromFile(inputFile);
        verify(numbersProcessor).processLine(input116);
        verify(numbersProcessor).processLine(input3045);
        verify(fileProcessor).writeLinesToFile(processed, outputFile);
    }
}