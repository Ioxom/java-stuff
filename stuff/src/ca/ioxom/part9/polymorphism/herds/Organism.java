package ca.ioxom.part9.polymorphism.herds;

public class Organism implements Movable {
    private int x;
    private int y;
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }

    public static void main(String[] args) {
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);
    }
}
