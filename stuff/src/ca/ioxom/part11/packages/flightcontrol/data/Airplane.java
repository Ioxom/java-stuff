package ca.ioxom.part11.packages.flightcontrol.data;

public class Airplane {
    private final String model;
    private final int capacity;

    public Airplane(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model + " (" + getCapacity() + " capacity)";
    }
}
