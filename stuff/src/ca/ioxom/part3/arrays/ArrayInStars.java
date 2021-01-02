package ca.ioxom.part3.arrays;

public class ArrayInStars {
    public static void printArrayInStars(int[] array) {
        for (int j : array) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] arrgs) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
}
