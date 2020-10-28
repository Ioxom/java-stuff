package ca.ioxom.part3.usingstrings;

import java.util.Scanner;

public class login {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        if (username.equals("username") && password.equals("password")) {
            System.out.println("You have successfully logged in!");
        }
        if (username.equals("username") && !password.equals("password")) {
            System.out.println("Incorrect password!");
        }
        if (username.equals("alex") && !password.equals("sunshine")) {
            System.out.println("Incorrect password!");
        }
        if (username.equals("alex") && password.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        }
        if (username.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        }
        if (username.equals("emma") && !password.equals("haskell")) {
            System.out.println("Incorrect password!");
        } else {
            System.out.println("nonexistent user");
        }
    }
}
