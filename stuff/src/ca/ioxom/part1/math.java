package ca.ioxom.part1;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        System.out.println("welcome to my bad calculator\nenter equations like this:\n[integer] [operator(x, +, -, ÷)] [integer]\ntype \"help\" for help");
        boolean stonp = false;
        while (!stonp) {
            //get equation
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter equation:");
            String[] equation = scanner.nextLine().split(" ");
            //help message
            if (equation[0].equals("help")) {
                System.out.println("syntax for equation: [integer] [operator(x, +, -, ÷)] [integer]\n" + "will crash if this syntax isn't followed");
                //ensure that the program doesn't crash converting "help" to an integer
            } else {
                //convert to integers
                double first = Double.parseDouble(equation[0]);
                double second = Double.parseDouble(equation[2]);
                //check operator -> do math
                switch (equation[1]) {
                    case "*":
                    case "x":
                        System.out.println("your result: " + (first * second));
                        break;
                    case "+":
                        System.out.println("your result: " + (first + second));
                        break;
                    case "-":
                        System.out.println("your result: " + (first - second));
                        break;
                    case "/":
                    case "÷":
                        System.out.println("your result: " + (first / second * 1.0));
                        break;
                    default:
                        System.out.println("invalid operator");
                }
                //stops if the user writes yes or true
                System.out.println("stonp the program?");
                String stop = scanner.nextLine();
                if (stop.equals("yes") || stop.equals("true")) {
                    stonp = true;
                }
            }
        }
    }
}
