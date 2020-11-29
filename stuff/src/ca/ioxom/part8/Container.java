package ca.ioxom.part8;

import java.util.Scanner;

public class Container {
    private int liquidAmount;
    public Container() {
        this.liquidAmount = 0;
    }

    public int contains() {
        return this.liquidAmount;
    }

    public void add(int amount) {
        if (amount + this.liquidAmount <= 100 && amount > 0) {
            this.liquidAmount += amount;
        } else if (amount > 100 || amount + this.liquidAmount >= 100) {
            this.liquidAmount = 100;
        }
    }

    public void remove(int amount) {
        if (this.liquidAmount - amount >= 0 && amount > 0) {
            this.liquidAmount -= amount;
        } else if (amount >= this.liquidAmount) {
            this.liquidAmount = 0;
        }
    }

    public String toString() {
        return this.liquidAmount + "/100";
    }

    public static void main(String[] arrgs) {
        Container first = new Container(), second = new Container();
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("First: " + first + "\nSecond: " + second);
            String command = scanner.nextLine();
            switch (command.split(" ")[0]) {
                case "quit":
                    break loop;
                case "add":
                    first.add(Integer.parseInt(command.split(" ")[1]));
                    break;
                case "move":
                    if (Integer.parseInt(command.split(" ")[1]) <= first.contains() && Integer.parseInt(command.split(" ")[1]) > 0) {
                        first.remove(Integer.parseInt(command.split(" ")[1]));
                        second.add(Integer.parseInt(command.split(" ")[1]));
                    } else if (Integer.parseInt(command.split(" ")[1]) > first.contains()) {
                        second.add(first.contains());
                        first.remove(100);
                    }
                    break;
                case "remove":
                    second.remove(Integer.parseInt(command.split(" ")[1]));
            }
        }
    }
}
