package se.lexicon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileParser {

    public static void fileParse(){
        Path filePath = Paths.get("dir/number.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) {
                try {
                    int number = Integer.parseInt(line.trim());
                    System.out.println("Parsed: " + number);

                } catch (NumberFormatException e) {
                    System.out.println("Cannot parse: '" + line + "'");
                }
            }

        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
