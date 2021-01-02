package ca.ioxom.part5.learningobjectorientedprogramming;

public class Cube {
    private final int edgeLength;
    public Cube (int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }


}
