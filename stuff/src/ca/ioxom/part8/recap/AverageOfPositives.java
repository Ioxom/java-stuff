package ca.ioxom.part8.recap;

import java.util.Scanner;

public class AverageOfPositives {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) break;
            else if (input > 0) {
                count ++;
                sum += input;
            }
        }
        if (!(count == 0 || sum == 0)) {
            System.out.println(sum / count);
        } else {
            System.out.println("cannot calculate average");
        }
    }
}
