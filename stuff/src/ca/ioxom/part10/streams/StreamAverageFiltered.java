package ca.ioxom.part10.streams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class StreamAverageFiltered {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = StreamAverage.getNumberInput(scanner);

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p [assumes positive if alternate letter is entered])");

        boolean printNegative = scanner.nextLine().equals("n");

        OptionalDouble average = input.stream()
                .mapToInt(Integer::parseInt)
                .filter(number -> printNegative? number < 0 : number > 0)
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
