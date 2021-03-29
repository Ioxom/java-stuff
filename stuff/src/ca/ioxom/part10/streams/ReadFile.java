package ca.ioxom.part10.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReadFile {
    public static List<String> read(String file) {
        List<String> lines = new ArrayList<>();

        try (Stream<String> readLines = Files.lines(Paths.get(file))) {
            readLines.forEach(lines::add);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lines;
    }

    public static void main(String[] args) {
        //print file to ensure our method worked as expected
        read("stuff/src/ca/ioxom/part10/streams/Divisible.java").forEach(System.out::println);
    }
}
