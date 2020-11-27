package ca.ioxom.part7.exercises;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    public String name;
    public int cookingTime;
    public ArrayList<String> ingredients;
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }

    public static void main(String[] arrgs) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        Scanner sysin = new Scanner(System.in);
        System.out.println("File to read:");
        try (Scanner scanner = new Scanner(Paths.get("stuff/src/ca/ioxom/part7/exercises/" + sysin.nextLine()))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.parseInt(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String input = scanner.nextLine();
                    if (input.isEmpty()) break;
                    ingredients.add(input);
                }
                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n");
        //I didn't know how to do this with a switch - thanks intelliJ
        label:
        while (true) {
            System.out.println("Enter command:");
            String command = sysin.nextLine();
            switch (command) {
                case "stop":
                    break label;
                case "list":
                    for (Recipe recipe : recipes) {
                        System.out.println(recipe);
                    }
                    break;
                case "find name":
                    System.out.println("Searched word: ");
                    String search = sysin.nextLine();
                    System.out.println("Recipes:");
                    for (Recipe recipe : recipes) {
                        if (recipe.name.contains(search)) {
                            System.out.println(recipe);
                        }
                    }
                    break;
                //I have no idea why this repeats "enter command" on completion
                case "find cooking time":
                    System.out.println("Max cooking time:");
                    int maxTime = sysin.nextInt();
                    System.out.println("Recipes:");
                    for (Recipe recipe : recipes) {
                        if (recipe.cookingTime <= maxTime) {
                            System.out.println(recipe);
                        }
                    }
                    break;
                case "find ingredient":
                    System.out.println("Ingredient:");
                    String ingredient = sysin.nextLine();
                    for (Recipe recipe : recipes) {
                        for (String i : recipe.ingredients) {
                            if (i.equals(ingredient)) {
                                System.out.println(recipe);
                                break;
                            }
                        }
                    }
            }
        }
    }
}
