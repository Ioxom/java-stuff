package ca.ioxom.part8.recap;

import java.util.Scanner;

//somewhat improved but mostly pasted in
public class LiquidContainers {
    public static void main(String[] arrgs) {
        int first = 0, second = 0;
        Scanner scanner = new Scanner(System.in);
        commandInput:
        while (true) {
            System.out.println("First: " + first + "/100" + "\nSecond: " + second + "/100");
            String command = scanner.nextLine();
            switch (command.split(" ")[0]) {
                case "quit":
                    break commandInput;
                case "add":
                    if (first + Integer.parseInt(command.split(" ")[1]) <= 100 && Integer.parseInt(command.split(" ")[1]) > 0) {
                        first += Integer.parseInt(command.split(" ")[1]);
                    } else if (first + Integer.parseInt(command.split(" ")[1]) > 100) {
                        first = 100;
                    }
                    break;
                case "move":
                    if (Integer.parseInt(command.split(" ")[1]) <= first && Integer.parseInt(command.split(" ")[1]) > 0 && Integer.parseInt(command.split(" ")[1]) + second <= 100) {
                        second += Integer.parseInt(command.split(" ")[1]);
                        first -= Integer.parseInt(command.split(" ")[1]);
                    } else if (Integer.parseInt(command.split(" ")[1]) > first && second + first <= 100) {
                        second += first;
                        first = 0;
                    } else {
                        first = 0;
                    }
                    break;
                case "remove":
                    if (Integer.parseInt(command.split(" ")[1]) <= second) {
                        second -= Integer.parseInt(command.split(" ")[1]);
                    } else {
                        second = 0;
                    }
                    break;
            }
        }
    }
}
