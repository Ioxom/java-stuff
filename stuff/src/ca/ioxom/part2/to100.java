package ca.ioxom.part2;

import java.util.Scanner;

public class to100 {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = number; i < 101; i++) {
            System.out.println(i);
        }
    }
}
