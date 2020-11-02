package ca.ioxom.part4.objectlists;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    private final String firstName;
    private final String lastName;
    private final int identificationNumber;
    public PersonalInformationCollection(String firstName, String lastName, int identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public static void main(String[] arrgs) {
        ArrayList<PersonalInformationCollection> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("First name:");
            //for some reason on the loop's second run it doesn't register this line as existing
            String firstName = scanner.nextLine();
            //hence this line
            if (firstName.equals("")) { firstName = scanner.nextLine(); }
            if (firstName.equals("")) {
                break;
            } else {
                System.out.println("Last name:");
                String lastName = scanner.nextLine();
                System.out.println("Identification number:");
                list.add(new PersonalInformationCollection(firstName, lastName, scanner.nextInt()));
            }
        }
        for (PersonalInformationCollection info : list) {
            System.out.println(info);
        }
    }
}
