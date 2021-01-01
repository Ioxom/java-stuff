package ca.ioxom.part4.filesanddata.numbersinfile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersInFile {
    public static void main(String[] arrgs) {
        Scanner sysIn = new Scanner(System.in);
        System.out.println("file:");
        String file = sysIn.nextLine();
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("stuff/src/ca/ioxom/part4/filesanddata/numbersInFile/" + file))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("reading the file " + file + " failed.");
        }
        System.out.println("lower bound?");
        int min = sysIn.nextInt();
        System.out.println("upper bound?");
        int max = sysIn.nextInt();
        for (String i : list) {
            if (Integer.parseInt(i) >= min && Integer.parseInt(i) <= max) {
                System.out.println(i);
            }
        }
    }
}
