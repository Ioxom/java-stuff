package ca.ioxom.part9.polymorphism.animals;

public class Dog extends Animal implements NoiseCapable {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(name + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.sleep();

        Dog fido = new Dog("Fido");
        fido.bark();
    }
}
