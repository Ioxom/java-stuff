package ca.ioxom.part2;

import java.util.Scanner;

public class program {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int evenCount = 0, oddCount = 0, numberCount = 0, sum = 0;
        System.out.println("Write numbers: ");
        while (true) {
            input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            sum += input;
            evenCount += (input % 2 == 0)? 1:0;
            oddCount += (input % 2 == 0)? 0:1;
            numberCount++;
        }
        System.out.println("Thx! Bye!\nsum: " + sum + "\nnumbers: " + numberCount);
        System.out.println("average: " + ((double) sum / (double) numberCount));
        System.out.println("odd count: " + oddCount + "\neven count: " + evenCount);
    }
}
