package ca.ioxom.part8.inheritance;

public class Person {
    protected final String name;
    protected final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.name + "\n  " + this.address;
    }
}
