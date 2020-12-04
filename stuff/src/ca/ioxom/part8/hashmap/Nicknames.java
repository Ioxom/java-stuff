package ca.ioxom.part8.hashmap;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] arrgs) {
        HashMap<String, String> nicknames = new HashMap<>();
        String[] names = {"matthew", "matt", "michael", "mix", "arthur", "artie"};
        for (int i = 0; i < 6; i += 2) {
            nicknames.put(names[i], names[i + 1]);
        }
        //just added a print to remove the warning
        System.out.println(nicknames);
    }
}
