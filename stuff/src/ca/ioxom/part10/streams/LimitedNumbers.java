package ca.ioxom.part10.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {
    public static List<Integer> getInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        while (true) {
            int line = scanner.nextInt();
            if (line > 0) {
                input.add(line);
            } else {
                break;
            }
        }

        return input;
    }

    public static void main(String[] args) {
        List<Integer> input = getInput();

        input.stream()
                .filter(s -> s >= 1 && s <= 5)
                .forEach(System.out::println);
    }
}
