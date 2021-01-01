package ca.ioxom.part5.objectsandreferences;

public class HealthStation {

    //class from course, not written by me
    private static class Person {

        private final String name;
        private int age;
        private int weight;
        private int height;

        public Person(String name) {
            this(name, 0, 0, 0);
        }

        public Person(String name, int age, int height, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        // other constructors and methods

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public int getHeight() {
            return this.height;
        }

        public void growOlder() {
            this.age = this.age + 1;
        }

        public void setHeight(int newHeight) {
            this.height = newHeight;
        }

        public void setWeight(int newWeight) {
            this.weight = newWeight;
        }

        public double bodyMassIndex() {
            double heightPerHundred = this.height / 100.0;
            return this.weight / (heightPerHundred * heightPerHundred);
        }

        @Override
        public String toString() {
            return this.name + ", age " + this.age + " years";
        }
    }
    private int weighings;
    public HealthStation() {
        this.weighings = 0;
    }

    public int weigh(Person person) {
        this.weighings ++;
        return person.weight;
    }
    
    public int weighings() {
        return this.weighings;
    }

    public void feed(Person person) {
        person.weight ++;
    }

    public static void main(String[] arrgs) {
        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
}
