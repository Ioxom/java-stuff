package ca.ioxom.part5.learningobjectorientedprogramming;

public class Book {
    //constructor
    private final String author;
    //renamed "name" to "title". thought it made more sense
    private final String title;
    private final int pages;
    public Book(String author, String name, int pages) {
        this.author = author;
        this.title = name;
        this.pages = pages;
    }

    //get info
    public String getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return this.title;
    }
    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return this.author + ", " + this.title + ", " + this.pages + " pages";
    }

    public static void main(String[] arrgs) {
        Book john = new Book("jhon", "john", 6483798);
        System.out.println(john);
    }
}
