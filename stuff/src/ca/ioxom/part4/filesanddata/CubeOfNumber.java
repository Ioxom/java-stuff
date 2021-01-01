package ca.ioxom.part4.filesanddata;

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            System.out.println(Integer.parseInt(input) * Integer.parseInt(input) * Integer.parseInt(input));
        }
    }
}
