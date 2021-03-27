package ca.ioxom.part9.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReturnSize {
    public static int returnSize(List<?> list) {
        return list.size();
    }

    public static int returnSize(Map<?, ?> map) {
        return map.size();
    }

    public static int returnSize(Set<?> set) {
        return set.size();
    }

    public static void main(String[] arrgs) {
        List<String> namesList = new ArrayList<>();
        namesList.add("First");
        namesList.add("Second");
        namesList.add("Third");

        System.out.println(returnSize(namesList));

        Map<String, String> namesMap = new HashMap<>();
        namesMap.put("1", "first");
        namesMap.put("2", "second");

        System.out.println(returnSize(namesMap));

        Set<String> namesSet = new HashSet<>();
        namesSet.add("first");
        namesSet.add("first");
        namesSet.add("second");
        namesSet.add("second");
        namesSet.add("second");

        System.out.println(returnSize(namesSet));
    }
}
