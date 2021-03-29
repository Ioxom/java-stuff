package ca.ioxom.part10.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class StreamAverage {
    public static List<String> getNumberInput(Scanner scanner) {
        List<String> input = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            } else {
                input.add(line);
            }
        }

        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = getNumberInput(scanner);

        OptionalDouble average = input.stream()
                .mapToInt(Integer::parseInt)
                .average();

        String averageString;
        if (average.isEmpty()) {
            averageString = "not enough values to determine the average";
        } else {
            averageString = "" + average.getAsDouble();
        }

        System.out.println("average of the numbers: " + averageString);
    }
}
