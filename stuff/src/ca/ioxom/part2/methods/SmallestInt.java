package ca.ioxom.part2.methods;

public class SmallestInt {
    public static int smallest(int number1, int number2) {
        //cheat the system using java's built-in Math class
        return Math.min(number1, number2);
    }

    public static void main(String[] args) {
        int answer =  smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }
}
