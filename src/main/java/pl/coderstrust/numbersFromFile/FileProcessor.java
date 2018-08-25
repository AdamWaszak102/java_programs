package pl.coderstrust.numbersFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Adam on 2018-04-09.
 */
public class FileProcessor {
    public List<String> readLinesFromFile(String fileName) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            return lines;
        }
    }

    public void writeLinesToFile(List<String> resultLines, String resultFileName) throws IOException {
        Path file = Paths.get(resultFileName);
        Files.write(file, resultLines, Charset.forName("UTF-8"));
    }
}