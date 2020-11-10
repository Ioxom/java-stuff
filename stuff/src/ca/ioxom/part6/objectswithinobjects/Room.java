package ca.ioxom.part6.objectswithinobjects;

import java.util.ArrayList;

public class Room {
    private static class Person {
        private final String name;
        private final double height;
        public Person(String name, double height) {
            this.name = name;
            this.height = height;
        }

        public String toString() {
            return this.name + " (" + this.height + " cm)";
        }
    }
    private final ArrayList<Person> people;
    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortest = this.people.get(0);
        for (Person person : this.people) {
            if (person.height < shortest.height) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortest = this.people.get(0);
        int index = 0;
        for (int i = 0; i < this.people.size(); i ++) {
            if (this.people.get(i).height > shortest.height) {
                shortest = this.people.get(i);
                index = i;
            }
        }
        this.people.remove(index);
        return shortest;
    }

    public boolean isEmpty() {
        return this.people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public static void main(String[] arrgs) {
        Room room = new Room();
        System.out.println("Shortest: " + room.shortest());
        System.out.println("Empty room? " + room.isEmpty());
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.shortest());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
    }
}
