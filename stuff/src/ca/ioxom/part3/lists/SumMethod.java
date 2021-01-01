package ca.ioxom.part3.lists;

import java.util.ArrayList;

public class SumMethod {
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] arrgs) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }
}
