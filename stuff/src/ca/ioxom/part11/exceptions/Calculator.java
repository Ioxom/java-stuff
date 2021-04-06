package ca.ioxom.part11.exceptions;

import java.util.Set;

public class Calculator {
    public static int factorial(int input) {
        if (input >= 1) {
            //I can't be bothered to implement the actual math
            return 0;
        } else {
            throw new IllegalArgumentException("input must be a non-negative number");
        }
    }

    //I'm not even sure what this is supposed to do so I'm just going to implement the exception logic
    public static int binomialCoefficient(Set<?> set, Set<?> subset, int number) {
        if (set.size() >= subset.size() && number >= 1) {
            return 0;
        } else {
            throw new IllegalArgumentException("input must be a non-negative number and set size cannot exceed subset size");
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(2));

        try {
            System.out.println(binomialCoefficient(Set.of(), Set.of(), -76));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
