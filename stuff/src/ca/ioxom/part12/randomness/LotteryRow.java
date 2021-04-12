package ca.ioxom.part12.randomness;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class LotteryRow {
    private List<Integer> numbers;
    private final Random random;

    public LotteryRow() {
        this.random = new Random();
        this.randomizeNumbers();
    }

    public List<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int number;
            do {
                number = random.nextInt(40) + 1;
            } while (containsNumber(number));
            numbers.add(random.nextInt(40) + 1);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LotteryRow that = (LotteryRow) o;
        return Objects.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        List<Integer> lotteryNumbers = row.numbers();

        System.out.println("Lottery numbers:");
        for (int number: lotteryNumbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}
