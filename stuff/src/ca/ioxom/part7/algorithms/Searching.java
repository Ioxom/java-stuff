package ca.ioxom.part7.algorithms;

import java.util.ArrayList;

public class Searching {
    public static class Book {
        public int id;
        public String name;
        public Book(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int start = 0;
        int end = books.size() - 1;
        while (end > start) {
            if (books.get((end + start) / 2).id == searchedId) {
                return (end + start) / 2;
            }
            if (books.get((end + start) / 2).id < searchedId) {
                start++;
            }
            if (books.get((end + start) / 2).id > searchedId) {
                end = (end + start) / 2 - 1;
            }
        }
        return -1;
    }

    public static void main(String[] arrgs) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(2, "h"));
        books.add(new Book(4, "h"));
        books.add(new Book(6, "h"));
        books.add(new Book(7, "h"));
        books.add(new Book(8, "h"));
        books.add(new Book(10, "h"));
        books.add(new Book(12, "h"));
        books.add(new Book(13, "h"));
        System.out.println(binarySearch(books, 8));
    }
}
