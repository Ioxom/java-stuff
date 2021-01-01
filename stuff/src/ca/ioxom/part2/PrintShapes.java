package ca.ioxom.part2;

public class PrintShapes {
    public static void main(String[] arrgs) {
        printRectangle(20, 7);
        //print an empty line
        System.out.println();
        printSquare(3);
        System.out.println();
        printTriangle(4);
    }
    public static void printSquare(int number) {
        for (int i = 0; i < number; i++) {
            Asterisk.printStars(number);
        }
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            Asterisk.printStars(width);
        }
    }
    public static void printTriangle(int size) {
        for (int i = size; i >= 0; i--) {
            Asterisk.printStars(size - i);
        }
    }
}
