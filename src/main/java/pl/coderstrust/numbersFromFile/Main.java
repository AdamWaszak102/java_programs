package pl.coderstrust.numbersFromFile;

import java.io.IOException;

/**
 * Created by Adam on 2018-04-09.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Processor processor = new Processor(new NumbersProcessor(), new FileProcessor());
        processor.process("src/main/resources/FileFirstNumbers.txt",
                "src/main/resources/FileFirstNumbersSum_processed.txt");

    }

}