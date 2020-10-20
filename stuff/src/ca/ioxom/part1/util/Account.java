package ca.ioxom.part1.util;

public class Account {
    public String name;
    public double balance;
    public static double editBalance(double balance, double modifier) {
        return balance + modifier;
    }
}
