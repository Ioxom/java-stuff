package ca.ioxom.part8.hashmap;

import java.util.HashMap;

public class PrintHashMapBookEdition {

    public static void printValues(HashMap<String,Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book.toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book.toString());
            }
        }
    }

    public static void main(String[] arrgs) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static class Book {
        private String name;
        private final String content;
        private final int published;

        public Book(String name, int published, String content) {
            this.name = name;
            this.published = published;
            this.content = content;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return "Name: " + this.name + " (" + this.published + ")\n"
                    + "Content: " + this.content;
        }
    }
}
