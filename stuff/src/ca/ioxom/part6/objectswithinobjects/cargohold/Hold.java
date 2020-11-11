package ca.ioxom.part6.objectswithinobjects.cargohold;

import java.util.ArrayList;

public class Hold {
    private final ArrayList<Suitcase> suitcases;
    private final int maxWeight;
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = 0;
        for (Suitcase currentSuitcase : this.suitcases) {
            weight += currentSuitcase.totalWeight();
        }
        weight += suitcase.totalWeight();
        if (weight <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        int suitcaseCount= 0;
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            suitcaseCount ++;
            weight += suitcase.totalWeight();
        }
        return (suitcaseCount > 0? (suitcaseCount == 1? "1 suitcase" : suitcaseCount + " suitcases") : "no suitcases") + " (" + weight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
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
