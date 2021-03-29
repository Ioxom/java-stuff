package ca.ioxom.part10.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Divisible {
    public static List<Integer> divisible(List<Integer> numbers) {
        return numbers.stream()
                .filter(s -> s % 2 == 0 || s % 3 == 0 || s % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        List<Integer> divisible = divisible(numbers);

        divisible.forEach(System.out::println);
    }
}
