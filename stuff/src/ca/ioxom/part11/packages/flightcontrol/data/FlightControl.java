package ca.ioxom.part11.packages.flightcontrol.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightControl {
    private final List<Airplane> planes;
    private final List<Flight> flights;

    public FlightControl() {
        planes = new ArrayList<>();
        flights = new ArrayList<>();
    }

    public Airplane getPlane(String model) {
        for (Airplane airplane : planes) {
            if (airplane.getModel().equals(model)) {
                return airplane;
            }
        }

        return null;
    }

    public void addPlane(Scanner scanner) {
        System.out.println("Give the airplane id:");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int capacity = scanner.nextInt();

        planes.add(new Airplane(id, capacity));
    }

    public void addFlight(Scanner scanner) {
        System.out.println("Give the airplane id:");
        Airplane airplane = getPlane(scanner.nextLine());
        if (airplane == null) {
            System.out.println("could not add airplane: invalid id");
            return;
        }
        System.out.println("Give the departure airport id:");
        String departureID = scanner.nextLine();
        System.out.println("Give the target airport id:");
        String arrivalID = scanner.nextLine();

        flights.add(new Flight(airplane, departureID, arrivalID));
    }

    public void printPlanes() {
        planes.forEach(System.out::println);
    }

    public void printPlane(String id) {
        System.out.println(getPlane(id));
    }

    public void printFlights() {
        flights.forEach(System.out::println);
    }
}
