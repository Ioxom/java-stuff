package ca.ioxom.part1;

import ca.ioxom.part1.util.Account;

import java.util.Scanner;

public class account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account excellentAccount = new Account();
        excellentAccount.balance = 200;
        boolean correctName = false;
        while (!correctName) {
            System.out.println("enter account name:");
            excellentAccount.name = scanner.nextLine();
            System.out.println("is this correct?\naccount name: " + excellentAccount.name);
            if (scanner.nextLine().equals("yes")) {
                correctName = true;
            }
            System.out.println("balance for " + excellentAccount.name + ":\n" + excellentAccount.balance + "\nadding 20 dollars to balance.");
            excellentAccount.balance = Account.editBalance(excellentAccount.balance, -20);
            System.out.println("new balance: " + excellentAccount.balance);
        }
    }
}
