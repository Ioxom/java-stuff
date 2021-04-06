package ca.ioxom.part2.problems;

import java.util.Scanner;

public class CompareInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double int1 = Double.parseDouble(scanner.nextLine());
        double int2 = Double.parseDouble(scanner.nextLine());
        if (int1 > int2) {
            System.out.println(int1 + " is greater than " + int2);
        } else if (int1 == int2) {
            System.out.println(int1 + " is equal to " + int2);
        } else {
            System.out.println(int1 + " is lesser than " + int2);
        }
    }
}
