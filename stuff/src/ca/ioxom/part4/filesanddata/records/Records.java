package ca.ioxom.part4.filesanddata.records;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Records {
    public static void main(String[] arrgs) {
        Scanner sysIn = new Scanner(System.in);
        System.out.println("name of the file:");
        String file = sysIn.nextLine();
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("stuff/src/ca/ioxom/part4/filesanddata/records/" + file))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("reading the file " + file + " failed.");
        }
        for (String i : list) {
            System.out.println(i.split(",")[0] + ", age: " + i.split(",")[1] + " " + (Integer.parseInt(i.split(",")[1]) > 1? "years" : "year"));
        }
    }
}
