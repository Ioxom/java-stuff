package ca.ioxom.part10.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalInformation {
    private final String firstName;
    private final String lastName;
    private final int birthYear;

    public PersonalInformation(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static PersonalInformation getInfoInput(Scanner scanner) {
        System.out.println("Input first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Input last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Input the year of birth: ");
        int birthYear = scanner.nextInt();

        return new PersonalInformation(firstName, lastName, birthYear);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PersonalInformation> people = new ArrayList<>();

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String input = scanner.nextLine();
            //again scanner doing the ignore that last line thing so we have to put this line in
            if (input.isEmpty()) { input = scanner.nextLine(); }
            if (input.equals("quit")) {
                break;
            } else {
                people.add(getInfoInput(scanner));
            }
        }

        System.out.println("Unique last names in alphabetical order:");
        people.stream()
                .map(PersonalInformation::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
