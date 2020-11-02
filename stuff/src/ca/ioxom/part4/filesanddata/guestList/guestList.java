package ca.ioxom.part4.filesanddata.guestList;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class guestList {
    public static void main(String[] arrgs) {
        ArrayList<String> guestList = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("stuff/src/ca/ioxom/part4/filesanddata/guestList/guestlist.txt"))) {
            while (scanner.hasNextLine()) {
                guestList.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Enter names, an empty line quits.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            boolean complete = false;
            for (String i : guestList) {
                if (input.equals(i)) {
                    System.out.println("The name is on the list.");
                    complete = true;
                }
            }
            if (!complete) {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
    }
}
