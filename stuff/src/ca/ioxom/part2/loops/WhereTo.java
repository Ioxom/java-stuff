package ca.ioxom.part2.loops;

import java.util.Scanner;

public class WhereTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("where to?");
        int to = Integer.parseInt(scanner.nextLine());
        System.out.println("where from?");
        int from = Integer.parseInt(scanner.nextLine());
        if (to < from) {
            System.out.println("yer bad");
        } else {
            for (int i = from; i < to + 1; i++) {
                System.out.println(i);
            }
        }
    }
}
