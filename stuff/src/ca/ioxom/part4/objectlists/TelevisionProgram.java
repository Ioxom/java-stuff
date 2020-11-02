package ca.ioxom.part4.objectlists;

import java.util.ArrayList;
import java.util.Scanner;

//this class is pre-made but I've had to make it myself
public class TelevisionProgram {
    private final String name;
    private final int duration;
    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }

    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> list = new ArrayList<>();
        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            //same thing happens as with PersonalInformationCollection
            //don't know what it is but this is a good workaround
            if (name.equals("")) { name = scanner.nextLine(); }
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Duration:");
            int duration = scanner.nextInt();
            list.add(new TelevisionProgram(name, duration));
        }
        System.out.println("Program's maximum duration?");
        int maxDuration = scanner.nextInt();
        for (TelevisionProgram televisionProgram : list) {
            if (televisionProgram.duration <= maxDuration) {
                System.out.println(televisionProgram);
            }
        }
    }
}
