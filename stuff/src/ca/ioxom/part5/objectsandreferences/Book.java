package ca.ioxom.part5.objectsandreferences;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private final String title;
    private final int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public boolean checkEquality(Book book) {
        return this.publicationYear == book.publicationYear && this.title.equals(book.title);
    }

    public static void main(String[] arrgs) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int booksAdded = 0;
        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            //I'll bet you forgot we have to do this
            if (name.equals("")) { name = scanner.nextLine(); }
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Publication year:");
            int publicationYear = scanner.nextInt();
            Book newBook = new Book(name, publicationYear);
            boolean bookFound = false;
            for (Book book : list) {
                if (book.checkEquality(newBook)) {
                    System.out.println("The book is already on the list. Let's not add the same book again.");
                    bookFound = true;
                }
            }
            if (!bookFound) {
                list.add(newBook);
                booksAdded ++;
            }
        }
        System.out.println("Thank you! Books added: " + booksAdded);
    }
}
