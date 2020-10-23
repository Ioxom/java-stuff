package ca.ioxom.part2;

public class astrology {
    public static void main(String[] arrgs) {
        printTriangle(4);
        System.out.println();
        christmasTree(32);
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
        //height is decreased by 2 for the trunk
        for (int i = height - 2; i >= 0; i--) {
            printSpaces(i);
            asterisk.printStars(((height - 2) - i) * 2 + 1);
        }
        //prints the trunk
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 3);
            System.out.print("***");
            System.out.println();
        }
    }
}
