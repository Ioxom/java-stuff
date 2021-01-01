package ca.ioxom.fun;

import java.util.Scanner;

public class ChristmasTreeGenerator {
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void christmasTree(int height) {
        if (height > 5 || height == 5) {
        //height is decreased by 2 for the trunk
        for (int i = height - 2; i >= 0; i--) {
            printSpaces(i);
            printStars(((height - 2) - i) * 2 + 1);
        }
        //prints the trunk
            for (int i = 0; i < 2; i++) {
                printSpaces(height - 3);
                System.out.print("***");
                System.out.println();
            }
        //tree breaks below 5 so compensate here
        } else {
            switch (height) {
                case 4:
                    System.out.println("  *");
                    System.out.println(" ***");
                    System.out.println("  *");
                    System.out.println("  *");
                    break;
                case 3:
                    System.out.println("  *");
                    System.out.println(" ***");
                    System.out.println("  *");
                    break;
                case 2:
                    System.out.println("***");
                    System.out.println(" *");
                    break;
                case 1:
                    System.out.println("*");
                    break;
            }
        }
    }
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter height:");
        christmasTree(scanner.nextInt());
    }
}
