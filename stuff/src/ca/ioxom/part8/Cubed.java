package ca.ioxom.part8;

import java.util.Scanner;

public class Cubed {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) break;
            System.out.println(input * input * input);
        }
    }
}
