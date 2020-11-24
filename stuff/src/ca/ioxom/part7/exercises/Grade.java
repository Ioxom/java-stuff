package ca.ioxom.part7.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade {

    public static double getAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static double getAverageOfPassing(ArrayList<Integer> grades) {
        int sum = 0, count = 0;
        for (int grade : grades) {
            if (grade >= 50) {
                sum += grade;
                count++;
            }
        }
        return (double) sum / count;
    }

    public static boolean anyPassingGrades(ArrayList<Integer> grades) {
        for (int grade : grades) {
            if (grade >= 50) {
                return true;
            }
        }
        return false;
    }

    public static double passingPercentage(ArrayList<Integer> grades) {
        int passing = 0;
        for (int grade : grades) {
            if (grade >= 50) {
                passing++;
            }
        }
        return (double) 100 * passing / grades.size();
    }

    public static void printDistribution(ArrayList<Integer> grades) {
        System.out.print("Grade distribution:");
        System.out.print("\n5: ");
        for (int grade : grades) {
            if (grade >= 90) System.out.print("*");
        }
        System.out.print("\n4: ");
        for (int grade : grades) {
            if (grade < 90 && grade >= 80) System.out.print("*");
        }
        System.out.print("\n3: ");
        for (int grade : grades) {
            if (grade < 80 && grade >= 70) System.out.print("*");
        }
        System.out.print("\n2: ");
        for (int grade : grades) {
            if (grade < 70 && grade >= 60) System.out.print("*");
        }
        System.out.print("\n1: ");
        for (int grade : grades) {
            if (grade < 60 && grade >= 50) System.out.print("*");
        }
        System.out.print("\n0: ");
        for (int grade : grades) {
            if (grade < 50) System.out.print("*");
        }
    }

    public static void main(String[] arrgs) {
        System.out.println("Enter point totals, -1 stops:");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) break;
            if (input >= 0 && input <= 100) {
                grades.add(input);
            }
        }
        System.out.println("Point average (all): " + getAverage(grades));
        System.out.println("Point average (passing): " + (anyPassingGrades(grades)? getAverageOfPassing(grades) : "-"));
        System.out.println("Pass percentage: " + passingPercentage(grades));
        printDistribution(grades);
    }
}
