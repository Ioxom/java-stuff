package ca.ioxom.part4.filesanddata.infile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class InFile {
    public static void main(String[] arrgs) {
        Scanner sysIn = new Scanner(System.in);
        System.out.println("name of the file:");
        String file = sysIn.nextLine();
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("stuff/src/ca/ioxom/part4/filesanddata/inFile/" + file))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("reading the file " + file + " failed.");
        }
        System.out.println("search for:");
        String search = sysIn.nextLine();
        boolean found = false;
        for (String i : list) {
            if (i.equals(search)) {
                System.out.println("found!");
                found = true;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}
