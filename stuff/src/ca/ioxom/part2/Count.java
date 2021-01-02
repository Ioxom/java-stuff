package ca.ioxom.part2;

import java.util.Scanner;

public class Count {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number + 1; i++) {
            System.out.println(i);
        }
    }
}
