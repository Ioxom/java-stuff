package ca.ioxom.part2.methods;

public class DivByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i < end; i++) {
            //checks for overflow using the modulo operator
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
