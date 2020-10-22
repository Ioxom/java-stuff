package ca.ioxom.part2;

public class smallestInt {
    public static int smallest(int number1, int number2) {
        return Math.min(number1, number2);
    }

    public static void main(String[] arrgs) {
        int answer =  smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }
}
