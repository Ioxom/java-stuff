package ca.ioxom.part4.filesanddata.printSpecifiedFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class printSpecifiedFile {
    public static void main(String[] arrgs) {
        Scanner sysIn = new Scanner(System.in);
        String file = sysIn.nextLine();
        try (Scanner scanner = new Scanner(Paths.get("stuff/src/ca/ioxom/part4/filesanddata/printSpecifiedFile/" + file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
