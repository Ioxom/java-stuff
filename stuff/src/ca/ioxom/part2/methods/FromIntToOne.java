package ca.ioxom.part2.methods;

public class FromIntToOne {
    public static void main(String[] args) {
        printFromNumberToOne(98);
    }
    public static void printFromNumberToOne(int start) {
        //remove from i as we want the number to decrease
        for (int i = start; i > 0; i--) {
            System.out.println(i);
        }
    }
}