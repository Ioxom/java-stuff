package ca.ioxom.part4.objectlists;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private final String name;
    private final int pages;
    private final int publicationYear;
    public Book(String name, int pages, int publicationYear) {
        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + publicationYear;
    }

    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            //workaround, again
            if (name.equals("")) { name = scanner.nextLine(); }
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pages = scanner.nextInt();
            System.out.println("Publication year:");
            int publicationYear = scanner.nextInt();
            list.add(new Book(name, pages, publicationYear));
        }
        System.out.println("What information will be printed?");
        String infoToPrint = scanner.nextLine();
        if (infoToPrint.equals("everything")) {
            for (Book book : list) {
                System.out.println(book);
            }
        } else if (infoToPrint.equals("name")) {
            for (Book book : list) {
                System.out.println(book.name);
            }
        } else {
            System.out.println("specify \"name\" or \"everything\"");
        }
    }
}
