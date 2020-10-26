package ca.ioxom.part3.arrays;

public class ArrayPrinter {
    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(i);
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }
    public static void main(String[] arrgs) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
}
