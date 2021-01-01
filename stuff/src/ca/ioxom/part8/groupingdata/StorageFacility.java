package ca.ioxom.part8.groupingdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StorageFacility {
    private final HashMap<String, ArrayList<String>> units;
    public StorageFacility() {
        this.units = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!this.units.containsKey(unit)) {
            this.units.put(unit, new ArrayList<>(Collections.singleton(item)));
        } else {
            ArrayList<String> items = this.units.get(unit);
            items.add(item);
            this.units.put(unit, items);
        }
    }

    public String contents(String storageUnit) {
        StringBuilder contents = new StringBuilder("[");
        for (String item : this.units.get(storageUnit)) {
            contents.append(item).append(", ");
        }
        contents.append("\b\b]");
        return contents.toString();
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> contents = this.units.get(storageUnit);
        contents.remove(item);
        if (contents.isEmpty()) {
            this.units.remove(storageUnit);
            return;
        }
        this.units.put(storageUnit, contents);
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(this.units.keySet());
    }

    public static void main(String[] arrgs) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }
}
