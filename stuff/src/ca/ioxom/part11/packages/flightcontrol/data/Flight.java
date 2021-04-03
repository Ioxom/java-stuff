package ca.ioxom.part11.packages.flightcontrol.data;

public class Flight {
    private final Airplane airplane;
    private final String departureID;
    private final String arrivalID;

    public Flight(Airplane airplane, String departureID, String arrivalID) {
        this.airplane = airplane;
        this.departureID = departureID;
        this.arrivalID = arrivalID;
    }

    @Override
    public String toString() {
        return airplane.toString() + " (" + departureID + "-" + arrivalID + ")";
    }
}
