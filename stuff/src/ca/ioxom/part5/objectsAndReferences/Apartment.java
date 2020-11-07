package ca.ioxom.part5.objectsAndReferences;

public class Apartment {
    private final int rooms;
    private final int squares;
    private final int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.pricePerSquare * this.squares - compared.pricePerSquare * compared.squares);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.squares * this.pricePerSquare > compared.squares * compared.pricePerSquare;
    }

    public static void main(String[] arrgs) {
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
    }
}
