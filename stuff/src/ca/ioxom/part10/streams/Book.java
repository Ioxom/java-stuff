package ca.ioxom.part10.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Book {
    private final String name;
    private final int publishingYear;
    private final int pages;
    private final String author;

    public Book(String name, int publishingYear, int pages, String author) {
        this.name = name;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + getName() + '\'' +
                ", publishingYear=" + getPublishingYear() +
                ", pages=" + getPages() +
                ", author='" + getAuthor() + '\'' +
                '}';
    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();

        try (Stream<String> readLines = Files.lines(Paths.get(file))) {
            readLines.map(line -> line.split(","))
                    .filter(line -> line.length >= 4)
                    .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    .forEach(books::add);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;
    }

    public static void main(String[] args) {
        readBooks("stuff/src/ca/ioxom/part10/streams/books.txt").forEach(System.out::println);
    }
}
