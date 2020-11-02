package ca.ioxom.part4.objectlists;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Items {
    private final String name;
    private final String time;
    public Items(String name) {
        this.name = name;
        this.time = (new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date()));
    }

    public String toString() {
        return (this.name + " (created at: " + this.time + ")");
    }

    public static void main(String[] arrgs) {
        ArrayList<Items> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name:");
            String itemName = scanner.nextLine();
            if (itemName.isEmpty()) {
                break;
            }
            list.add(new Items(itemName));
        }
        for (Items items : list) {
            System.out.println(items);
        }
    }
}
