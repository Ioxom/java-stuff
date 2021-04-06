package ca.ioxom.part11.exceptions;

public class Person {
    public final int age;
    public final String name;

    public Person(int age, String name) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("age must be between 0 and 120");
        }

        if (!name.isEmpty() && name.length() <= 40) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("name must not be empty and be under 40 characters in length");
        }
    }

    public static void main(String[] args) {
        Person person = new Person(45, "john mcafee");
        System.out.println(person);

        try {
            Person person1 = new Person(355, "slim kroy");
            //exception is thrown and this print isn't called
            System.out.println(person1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
