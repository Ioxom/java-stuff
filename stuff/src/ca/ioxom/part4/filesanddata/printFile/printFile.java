package ca.ioxom.part4.filesanddata.printFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class printFile {
    public static void main(String[] arrgs) {
        //long path I know
        //I definitely overdo it with the packages and classes
        try (Scanner scanner = new Scanner(Paths.get("stuff/src/ca/ioxom/part4/filesanddata/printFile/data.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
