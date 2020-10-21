package ca.ioxom.part2;

public class fromIntToOne {
    public static void main(String[] arrgs) {
        printFromNumberToOne(98);
    }
    public static void printFromNumberToOne(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println(i);
        }
    }
}
