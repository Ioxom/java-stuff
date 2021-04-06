package ca.ioxom.part2.methods;

public class Asterisk {
    public static void main(String[] args) {
        printStars(6);
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
