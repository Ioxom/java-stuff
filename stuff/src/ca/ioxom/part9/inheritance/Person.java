package ca.ioxom.part9.inheritance;

import java.util.ArrayList;

public class Person {
    protected final String name;
    protected final String address;

    public Person(final String name, final String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\n   " + address;
    }

    public static class Student extends Person {
        private int credits;

        public Student(final String name, final String address) {
            super(name, address);
            credits = 0;
        }

        public void study() {
            credits ++;
        }

        public int credits() {
            return credits;
        }

        @Override
        public String toString() {
            return super.toString() + "\nStudy credits " + credits();
        }
    }

    public static class Teacher extends Person {
        private final int salary;

        public Teacher(final String name, final String address, final int salary) {
            super(name, address);
            this.salary = salary;
        }

        @Override
        public String toString() {
            return super.toString() + "\n  salary " + salary + " euro/month";
        }
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] arrgs) {
        Student h = new Student("h", "h drive, h");
        h.study();

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }
}
