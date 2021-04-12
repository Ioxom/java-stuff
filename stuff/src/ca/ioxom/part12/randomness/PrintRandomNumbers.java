package ca.ioxom.part12.randomness;

import java.util.Random;
import java.util.Scanner;

public class PrintRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.print("How many random numbers should be printed? ");
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.println(r.nextInt(10));
        }
    }
}
