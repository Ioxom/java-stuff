package ca.ioxom.part8.recap;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private final ArrayList<String> tasks;
    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void remove(int index) {
        this.tasks.remove(index - 1);
    }

    public void print() {
        for (int i = 1; i < this.tasks.size() + 1; i++) {
            System.out.println(i + ": " + this.tasks.get(i - 1));
        }
    }

    public static class UserInterface {
        private final TodoList todoList;
        private final Scanner scanner;
        public UserInterface() {
            this.todoList = new TodoList();
            this.scanner = new Scanner(System.in);
        }

        public void start() {
            program:
            while (true) {
                System.out.println("Command:");
                String command = this.scanner.nextLine();
                if (command.isEmpty()) command = scanner.nextLine();
                switch (command) {
                    case "stop":
                        break program;
                    case "add":
                        System.out.println("To add:");
                        this.todoList.add(this.scanner.nextLine());
                        break;
                    case "list":
                        this.todoList.print();
                        break;
                    case "remove":
                        System.out.println("Which one is removed?");
                        this.todoList.remove(this.scanner.nextInt());
                        break;
                }
            }
        }
    }

    public static void main(String[] arrgs) {
        UserInterface ui = new UserInterface();
        ui.start();
    }
}
