package ca.ioxom.part2;

public class Asterisk {
    public static void main(String[] arrgs) {
        printStars(6);
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
