package ca.ioxom.part2;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);
        while (!stop) {
            System.out.println("Shall we carry on?");
            if (scanner.nextLine().equals("no")) { stop = true; }
        }
    }
}
