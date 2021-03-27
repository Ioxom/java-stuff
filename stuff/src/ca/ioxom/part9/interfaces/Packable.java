package ca.ioxom.part9.interfaces;

import java.util.ArrayList;

public interface Packable {
    double weight();

    class Book implements Packable {
        private final String author;
        private final String name;
        private final double weight;

        public Book(String author, String name, double weight) {
            this.author = author;
            this.name = name;
            this.weight = weight;
        }

        @Override
        public double weight() {
            return weight;
        }

        @Override
        public String toString() {
            return author + ": " + name;
        }
    }

    class CD implements Packable {
        private final String artist;
        private final String name;
        private final int publicationYear;

        public CD(String artist, String name, int publicationYear) {
            this.artist = artist;
            this.name = name;
            this.publicationYear = publicationYear;
        }

        @Override
        public double weight() {
            return 0.1;
        }

        @Override
        public String toString() {
            return artist + ": " + name + "(" + publicationYear + ")";
        }
    }

    class Box implements Packable {
        private final int capacity;
        private final ArrayList<Packable> packables;

        public Box(int capacity) {
            this.capacity = capacity;
            this.packables = new ArrayList<>();
        }

        public void add(Packable packable) {
            if (weight() + packable.weight() <= capacity) {
                packables.add(packable);
            }
        }

        public double weight() {
            double weight = 0;
            for (Packable packable : packables) {
                weight += packable.weight();
            }

            return weight;
        }

        @Override
        public String toString() {
            return "Box: " + packables.size() + " items, total weight " + weight() + " kg";
        }
    }

    static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}
