package ca.ioxom.part6.objectswithinobjects.cargohold;

import java.util.ArrayList;

public class Suitcase {
    private final ArrayList<Item> items;
    private final int maxWeight;
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int weight = 0;
        for (Item currentItem : this.items) {
            weight += currentItem.getWeight();
        }
        weight += item.getWeight();
        if (weight <= maxWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        int itemCount= 0;
        int weight = 0;
        for (Item item : this.items) {
            itemCount++;
            weight += item.getWeight();
        }
        return (itemCount > 0? (itemCount == 1? "1 item" : itemCount + " items") : "no items") + " (" + weight + " kg)";
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Item item : this.items) {
            weight += item.getWeight();
        }
        return weight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        } else {
            Item heaviestItem = this.items.get(0);
            for (Item item : this.items) {
                if (heaviestItem.getWeight() < item.getWeight()) {
                    heaviestItem = item;
                }
            }
            return heaviestItem;
        }
    }

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
    }
}
