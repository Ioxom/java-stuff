package ca.ioxom.part6.uiandlogic;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeRegister {

    public static class UserInterface {

        private final GradeRegister register;
        private final Scanner scanner;

        public UserInterface(GradeRegister register, Scanner scanner) {
            this.register = register;
            this.scanner = scanner;
        }

        public void start() {
            readPoints();
            System.out.println();
            printGradeDistribution();
            System.out.println("The average of points: " + this.register.averageOfPoints());
            System.out.println("The average of grades: " + this.register.averageOfGrades());
        }

        public void readPoints() {
            while (true) {
                System.out.print("Points: ");
                String input = scanner.nextLine();
                if (input.equals("")) {
                    break;
                }

                int points = Integer.parseInt(input);

                if (points < 0 || points > 100) {
                    System.out.println("Impossible number.");
                    continue;
                }

                this.register.addGradeBasedOnPoints(points);
            }
        }

        public void printGradeDistribution() {
            int grade = 5;
            while (grade >= 0) {
                int stars = register.numberOfGrades(grade);
                System.out.print(grade + ": ");
                printStars(stars);
                System.out.println();

                grade = grade - 1;
            }
        }

        public static void printStars(int stars) {
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }
        }
    }

    private final ArrayList<Integer> grades;
    private final ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) return -1;
        double sum = 0, count = 0;
        for (Integer grade : this.grades) {
            sum += grade;
            count ++;
        }
        return (sum / count);
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) return -1;
        double sum = 0, count = 0;
        for (Integer grade : this.points) {
            sum += grade;
            count ++;
        }
        return (sum / count);
    }

    public static int pointsToGrades(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public static void main(String[] arrgs) {
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);

        System.out.println(register.averageOfPoints());
    }
}

