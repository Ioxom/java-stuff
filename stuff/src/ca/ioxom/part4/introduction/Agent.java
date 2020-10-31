package ca.ioxom.part4.introduction;

public class Agent {
    private final String firstName;
    private final String lastName;
    public Agent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return ("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
    }

    public static void main(String[] arrgs) {
        Agent bond = new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }
}
