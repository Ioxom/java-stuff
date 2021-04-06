package ca.ioxom.part2.problems;

import java.util.Scanner;

public class GetAbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //absolute can also be calculated with int * -1
        System.out.println("absolute value: " + Math.abs(Integer.parseInt(scanner.nextLine())));
    }
}
