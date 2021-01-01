package ca.ioxom.part2;

public class PrintUntilInt {
    public static void main(String[] arrgs) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int finish) {
        for (int i = 1; i < finish + 1; i++) {
            System.out.println(i);
        }
    }
}
