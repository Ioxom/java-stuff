package ca.ioxom.part3.lists;

import java.util.ArrayList;

public class removeLastEntry {
    public static void removeLast(ArrayList<String> strings) {
        strings.remove(strings.size() - 1);
    }
    public static void main(String[] arrgs) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
}
