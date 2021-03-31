package ca.ioxom.part10.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> {
    private final String title;
    private final int ageRecommendation;

    public Book(String title, int ageRecommendation) {
        this.title = title;
        this.ageRecommendation = ageRecommendation;
    }

    public String getTitle() {
        return title;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    @Override
    public String toString() {
        return title + " (recommended for " + ageRecommendation + " year-olds or older)";
    }

    @Override
    public int compareTo(Book o) {
        return o.getAgeRecommendation() - getAgeRecommendation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ageRecommendation == book.ageRecommendation && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAgeRecommendation());
    }

    public static void main(String[] args) {
        final List<Book> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            //we meet again, stupid hack for keeping the program from skipping my call
            if (name.isEmpty()) {
                name = scanner.nextLine();
            }

            if (name.isEmpty()) {
                break;
            } else {
                System.out.println("Input the age recommendation:");
                int recommendation = scanner.nextInt();
                list.add(new Book(name, recommendation));
            }
        }

        System.out.println(list.size() + " books in total.");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getTitle);

        list.sort(comparator);

        list.forEach(System.out::println);
    }
}
