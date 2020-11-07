package ca.ioxom.part5.objectsAndReferences;

import java.util.ArrayList;
import java.util.Scanner;

public class Archive {
    private final String name;
    private final String identifier;
    public Archive(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public static void main(String[] arrgs) {
        ArrayList<Archive> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            if (name.equals("")) {
                name = scanner.nextLine();
            }
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Identifier");
            String identifier = scanner.nextLine();
            boolean isOnList = false;
            for (Archive archive : list) {
                if (identifier.equals(archive.getIdentifier())) {
                    isOnList = true;
                    break;
                }
            }
            if (!isOnList) {
                list.add(new Archive(name, identifier));
            }
        }
        System.out.println("==Items==");
        for (Archive archive : list) {
            System.out.println(archive);
        }
    }
}
