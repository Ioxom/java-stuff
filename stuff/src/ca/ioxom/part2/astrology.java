package ca.ioxom.part2;

public class astrology {
    public static void main(String[] arrgs) {
        printTriangle(4);
        System.out.println();
        christmasTree(10);
    }
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printTriangle(int size) {
        for (int i = size; i >= 0; i--) {
            printSpaces(i);
            asterisk.printStars(size - i);
        }
    }
    public static void christmasTree(int height) {
        for (int i = height - 2; i >= 0; i--) {
            printSpaces(i);
            asterisk.printStars(((height - 2) - i) * 2 + 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(0); //unfinished
            System.out.print("***");
            System.out.println();
        }
    }
}
