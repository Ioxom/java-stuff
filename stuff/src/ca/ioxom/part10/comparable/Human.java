package ca.ioxom.part10.comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Human implements Comparable<Human> {
    private final String name;
    private final int hourlyWage;

    public Human(String name, int hourlyWage) {
        this.name = name;
        this.hourlyWage = hourlyWage;
    }

    public String getName() {
        return name;
    }

    public final int getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", hourlyWage=" + hourlyWage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return hourlyWage == human.hourlyWage && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hourlyWage);
    }

    @Override
    public int compareTo(Human human) {
        return human.hourlyWage - hourlyWage;
    }

    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human("john", 23));
        list.add(new Human("bob", 16));
        list.add(new Human("jennifer", 34));
        list.add(new Human("jessica", 30));

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
