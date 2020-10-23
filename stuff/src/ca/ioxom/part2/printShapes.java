package ca.ioxom.part2;

public class printShapes {
    public static void main(String[] arrgs) {
        printRectangle(20, 7);
        System.out.println();
        printSquare(3);
        System.out.println();
        printTriangle(4);
    }
    public static void printSquare(int number) {
        for (int i = 0; i < number; i++) {
            asterisk.printStars(number);
        }
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            asterisk.printStars(width);
        }
    }
    public static void printTriangle(int size) {
        for (int i = size; i >= 0; i--) {
            asterisk.printStars(size - i);
        }
    }
}
