package ca.ioxom.part10.comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return getName().compareTo(o.getName());
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("john"));
        list.add(new Student("bob"));
        list.add(new Student("jennifer"));
        list.add(new Student("jessica"));

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
