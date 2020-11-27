package ca.ioxom.part7.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Bird {
    public String name;
    public String latinName;
    public int observations;
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }

    public static void main(String[] arrgs) {
        ArrayList<Bird> birds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("?");
            commands:
            switch (scanner.nextLine()) {
                case "quit": case "Quit":
                    break label;
                case "add": case "Add":
                    System.out.println("name:");
                    String birdName = scanner.nextLine();
                    System.out.println("latin name:");
                    birds.add(new Bird(birdName, scanner.nextLine()));
                    break;
                case "observation": case "Observation":
                    System.out.println("bird?");
                    String bird = scanner.nextLine();
                    for (Bird i : birds) {
                        if (i.name.equals(bird)) {
                            i.observations ++;
                            break commands;
                        }
                    }
                    System.out.println("Not a bird!");
                    break;
                case "all": case "All":
                    for (Bird i : birds) {
                        System.out.println(i);
                    }
                    break;
                case "one": case "One":
                    System.out.println("bird?");
                    String bird0 = scanner.nextLine();
                    for (Bird i : birds) {
                        if (i.name.equals(bird0)) {
                            System.out.println(i);
                            break commands;
                        }
                    }
                    System.out.println("Not a bird!");
            }
        }
    }
}
