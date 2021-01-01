package ca.ioxom.part3.arrays;

public class SumOfArray {
    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] arrgs) {
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));
    }
}
