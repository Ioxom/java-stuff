package ca.ioxom.part9.inheritance;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Box {
    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);

    //we assume we'll be using the same item class as cargo hold from earlier
    public static class Item {
        private final String name;
        private final int weight;

        public Item(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public Item(String name) {
            this.name = name;
            this.weight = 1;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public String toString() {
            return getName() + " (" + getWeight() + " kg)";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) {
                return false;
            } else {
                return name.equals(((Item) o).getName());
            }
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, weight);
        }
    }

    public static class BoxWithMaxWeight extends Box {
        private final int capacity;
        private final ArrayList<Item> items;

        public BoxWithMaxWeight(int capacity) {
            this.capacity = capacity;
            this.items = new ArrayList<>();
        }

        @Override
        public void add(Item item) {
            if (getWeight() + item.getWeight() <= capacity) {
                this.items.add(item);
            }
        }

        public int getWeight() {
            int weight = 0;
            for (Item item : items) {
                weight += item.getWeight();
            }

            return weight;
        }

        @Override
        public boolean isInBox(Item item) {
            return items.contains(item);
        }
    }

    public static class OneItemBox extends Box {
        private Item item;

        @Override
        public void add(Item item) {
            if (this.item == null) {
                this.item = item;
            }
        }

        @Override
        public boolean isInBox(Item item) {
            return this.item.equals(item);
        }
    }

    public static class MisplacingBox extends Box {

        @Override
        public void add(Item item) {
            //do nothing?
        }

        @Override
        public boolean isInBox(Item item) {
            return false;
        }
    }

    public static void main(String[] arrgs) {
        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }
}
