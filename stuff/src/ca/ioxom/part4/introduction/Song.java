package ca.ioxom.part4.introduction;

public class Song {
    private final String name;
    private final int length;
    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public int getLength() {
        return this.length;
    }

    public static void main(String[] arrgs) {
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.getName() + " has a length of " + garden.getLength() + " seconds.");
    }
}
