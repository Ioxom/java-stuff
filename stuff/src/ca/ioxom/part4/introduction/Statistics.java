package ca.ioxom.part4.introduction;

import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public double average() {
        return ((double) this.sum / this.count);
    }

    private int sum() {
        return this.sum;
    }

    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            statistics.addNumber(input);
            if (input % 2 == 0) {
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
        }
        System.out.println("sum: " + statistics.sum());
        System.out.println("sum of even numbers: " + even.sum());
        System.out.println("sum of odd numbers: " + odd.sum());
    }
}
