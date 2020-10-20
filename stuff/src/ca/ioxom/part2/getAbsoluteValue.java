package ca.ioxom.part2;

import java.util.Scanner;

public class getAbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //absolute can also be calculated with int * -1
        System.out.println("absolute value: " + Math.abs(Integer.parseInt(scanner.nextLine())));
    }
}
