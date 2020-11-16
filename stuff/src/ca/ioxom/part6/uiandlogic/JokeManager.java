package ca.ioxom.part6.uiandlogic;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private final ArrayList<String> jokes;
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            return this.jokes.get(draw.nextInt(jokes.size()));
        }
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }

    public static class UserInterface {
        private final JokeManager jokeManager;
        private final Scanner scanner;
        public UserInterface(JokeManager jokeManager, Scanner scanner) {
            this.jokeManager = jokeManager;
            this.scanner = scanner;
        }

        public void start() {
            while (true) {
                System.out.println("Commands:\n" +
                        "1 - add a joke\n" +
                        "2 - draw a joke\n" +
                        "3 - list jokes\n" +
                        "X - stop");
                String command = scanner.nextLine();
                if (command.equals("X") || command.equals("x")) {
                    break;
                } else {
                    switch (command) {
                        case "1":
                            this.jokeManager.addJoke(scanner.nextLine());
                            break;
                        case "2":
                            System.out.println(this.jokeManager.drawJoke());
                            break;
                        case "3":
                            this.jokeManager.printJokes();
                            break;
                    }
                }
            }
        }
    }

    public static void main(String[] arrgs) {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
