package ca.ioxom.part9.polymorphism.herds;

import java.util.ArrayList;

public class Herd implements Movable {
    private final ArrayList<Movable> movables;

    public Herd() {
        movables = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable i : movables) {
            i.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable) {
        movables.add(movable);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(movables.get(0).toString());
        for (int i = 1; i < movables.size(); i++) {
            builder.append("\n").append(movables.get(i).toString());
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
    }
}
