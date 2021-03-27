package ca.ioxom.part9.polymorphism.animals;

public abstract class Animal {
    protected final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

    public void eat() {
        System.out.println(name + " eats");
    }
}
