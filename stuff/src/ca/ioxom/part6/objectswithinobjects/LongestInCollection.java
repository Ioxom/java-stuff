package ca.ioxom.part6.objectswithinobjects;

import java.util.ArrayList;

public class LongestInCollection {
    private static class SimpleCollection {
        private final String name;
        private final ArrayList<String> items;

        public SimpleCollection(String name) {
            this.name = name;
            this.items = new ArrayList<>();
        }

        public void add(String addition) {
            this.items.add(addition);
        }

        public String longest() {
            String longest = "";
            //change longest if the value has more characters
            for (String value : this.items) {
                if (value.length() > longest.length()) {
                    longest = value;
                }
            }
            //if longest hasn't been changed (i.e. the list is empty) return null
            if (longest.isEmpty()) {
                return null;
            } else {
                return longest;
            }
        }

        public String toString() {
            if (this.items.isEmpty()) {
                return "The collection " + this.name + " is empty.";
            } else {
                //save all the items to a printable list
                StringBuilder itemList = new StringBuilder("\n");
                for (int i = 0; i < this.items.size(); i++) {
                    //don't add a newline on the last item
                    if (!(i == this.items.size() - 1)) {
                        itemList.append(this.items.get(i)).append("\n");
                    } else {
                        itemList.append(items.get(i));
                    }
                }
                //pluralize if there are multiple items in the list
                return "The collection " + this.name + " has " + this.items.size() + (this.items.size() == 1 ? " element: " : " elements:") + itemList;
            }
        }
    }

    public static void main(String[] arrgs) {
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());
    }
}
