package ca.ioxom.part9.polymorphism.animals;

public class Cat extends Animal implements NoiseCapable {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(name + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat2 = new Cat("Garfield");
        cat2.makeNoise();
        Cat c = (Cat) cat2;
        c.purr();
    }
}
