package ca.ioxom.part2;

import java.util.Scanner;

public class Unsuitable {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int integer = Integer.parseInt(scanner.nextLine());
            if (integer < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            if (integer > 0) {
                System.out.println(integer * integer);
            } else {
                break;
            }
        }
    }
}
