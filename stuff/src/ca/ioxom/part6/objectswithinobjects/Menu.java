package ca.ioxom.part6.objectswithinobjects;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;
    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        boolean found = false;
        for (String currentMeal : this.meals) {
            if (currentMeal.equals(meal)) {
                found = true;
                break;
            }
        }
        if (!found) {
            this.meals.add(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public static void main(String[] arrgs) {
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
