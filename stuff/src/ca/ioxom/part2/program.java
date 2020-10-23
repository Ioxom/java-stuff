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
            //end if the input is -1
            if (input == -1) {
                break;
            }
            sum += input;
            //check if the number is divisible by 2 with the modulo operator
            //if yes, add to evenCount. if no, add to oddCount
            evenCount += (input % 2 == 0)? 1:0;
            oddCount += (input % 2 == 0)? 0:1;
            numberCount++;
        }
        System.out.println("Thx! Bye!\nsum: " + sum + "\nnumbers: " + numberCount);
        System.out.println("average: " + ((double) sum / (double) numberCount));
        System.out.println("odd count: " + oddCount + "\neven count: " + evenCount);
    }
}
