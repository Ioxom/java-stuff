package ca.ioxom.part7.exercises;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

//very unfinished, doesn't work at all
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
        return "name: " + this.name + "\ncooking time: " + this.cookingTime + "\ningredients: \n" + this.ingredients.get(0);
    }

    public static void addRecipeFromFile(Scanner scanner, ArrayList<Recipe> recipes) {
        String name = scanner.nextLine();
        int cookingTime = scanner.nextInt();
        ArrayList<String> ingredients = new ArrayList<>();
        while (!scanner.nextLine().isEmpty()) {
            ingredients.add(scanner.nextLine());
        }
        recipes.add(new Recipe(name, cookingTime, ingredients));
    }

    public static void main(String[] arrgs) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("stuff/src/ca/ioxom/part7/exercises/recipes.txt"))) {
            addRecipeFromFile(scanner, recipes);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(recipes.get(0));
    }
}
