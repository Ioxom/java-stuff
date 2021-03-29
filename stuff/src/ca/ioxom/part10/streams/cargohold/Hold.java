package ca.ioxom.part10.streams.cargohold;

import java.util.ArrayList;
import java.util.List;

public class Hold {
    private final List<Suitcase> suitcases;
    private final int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + getWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int getWeight() {
        return suitcases.stream()
                .map(Suitcase::totalWeight)
                .reduce(0, Integer::sum);
    }

    public String toString() {
        int suitcaseCount = suitcases.size();

        if (suitcaseCount == 0) {
            return "no suitcases (" + getWeight() + " kg)";
        } else {
            return (suitcaseCount == 1? "1 suitcase" : suitcaseCount + " suitcases") + " (" + getWeight() + " kg)";
        }
    }

    public void printItems() {
        suitcases.forEach(Suitcase::printItems);
    }

    public static void main(String[] arrgs) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
