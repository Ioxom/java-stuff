package ca.ioxom.part8.hashmap;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] arrgs) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        //just added a print to remove the warning
        System.out.println(nicknames);
    }
}
