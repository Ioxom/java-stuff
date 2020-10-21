package ca.ioxom.part2;

public class divByThree {
    public static void main(String[] arrgs) {
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
