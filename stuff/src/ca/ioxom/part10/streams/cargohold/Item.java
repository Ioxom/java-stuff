package ca.ioxom.part10.streams.cargohold;

public class Item {
    private final String name;
    private final int weight;
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return getName()+ " (" + getWeight() + " kg)";
    }
}
