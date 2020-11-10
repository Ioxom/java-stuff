package ca.ioxom.part6.objectswithinobjects;

import java.util.ArrayList;

public class Package {
    public static class Gift {
        private final String name;
        private final int weight;
        public Gift(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return this.name;
        }
        public int getWeight() {
            return this.weight;
        }

        public String toString() {
            return this.name + " (" + this.weight + " kg)";
        }
    }

    private final ArrayList<Gift> list;
    public Package() {
        this.list = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.list.add(gift);
    }

    public int totalWeight() {
        int weight= 0;
        for (Gift gift : list) {
            weight += gift.getWeight();
        }
        return weight;
    }

    public static void main(String[] arrgs) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
