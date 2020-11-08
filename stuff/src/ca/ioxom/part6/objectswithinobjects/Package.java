package ca.ioxom.part6.objectswithinobjects;

import java.util.ArrayList;

public class Package {
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
