package ca.ioxom.part10.streams.cargohold;

import java.util.ArrayList;
import java.util.List;

public class Suitcase {
    private final List<Item> items;
    private final int maxWeight;
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        String text = items.size() == 1 ? "1 item" : items.size() + " items";
        return (items.isEmpty() ? text : "no items") + " (" + totalWeight() + " kg)";
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

    public int totalWeight() {
        return items.stream()
                .mapToInt(Item::getWeight)
                .reduce(0, Integer::sum);
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        } else {
            return items.stream()
                    .reduce(items.get(0), (previous, current) -> previous.getWeight() > current.getWeight() ? previous : current);
        }
    }

    public static void main(String[] arrgs) {
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
