package ca.ioxom.part10.techniques;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public enum Education {
    PHD,
    MA,
    BA,
    HS;

    public static class Person {
        private final Education education;
        private final String name;

        public Person(String name, Education education) {
            this.name = name;
            this.education = education;
        }

        @Override
        public String toString() {
            return name + ", " + education;
        }

        public Education getEducation() {
            return education;
        }

        public String getName() {
            return name;
        }
    }

    public static class Employees {
        private final List<Person> persons;

        public Employees() {
            this.persons = new ArrayList<>();
        }

        public void add(Person personToAdd) {
            persons.add(personToAdd);
        }

        public void add(List<Person> peopleToAdd) {
            persons.addAll(peopleToAdd);
        }

        public void print() {
            Iterator<Person> iterator = getIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

        public void print(Education education) {
            persons.stream()
                    .filter(e -> e.getEducation().equals(education))
                    .forEach(System.out::println);
        }

        private Iterator<Person> getIterator() {
            return persons.iterator();
        }

        public void fire(Education education) {
            Iterator<Person> iterator = getIterator();
            while (iterator.hasNext()) {
                if (iterator.next().getEducation().equals(education)) {
                    iterator.remove();
                }
            }
        }
    }

    public static void main(String[] args) {
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));
        university.add(new Person("Johnson", Education.MA));
        university.add(new Person("Cynthia", Education.BA));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}
