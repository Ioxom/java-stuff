package ca.ioxom.part11.packages.flightcontrol.ui;

import ca.ioxom.part11.packages.flightcontrol.data.FlightControl;

import java.util.Scanner;

public class UserInterface {
    private final FlightControl flightControl;
    private final Scanner scanner;

    public UserInterface(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void addAssets() {
        while (true) {
            System.out.println("""
                    Choose an action:
                    [1] Add an airplane
                    [2] Add a flight
                    [x] Exit Airport Asset Control""");

            String input = scanner.nextLine();
            while (input.isEmpty()) {
                input = scanner.nextLine();
            }

            switch (input) {
                case "1":
                    flightControl.addPlane(scanner);
                    break;
                case "2":
                    flightControl.addFlight(scanner);
                    break;
                case "x":
                    return;
            }
        }
    }

    public void controlFlights() {
        while (true) {
            System.out.println("""
                    Choose an action:
                    [1] Print airplanes
                    [2] Print flights
                    [3] Print airplane details
                    [x] Quit""");

            String input = scanner.nextLine();
            while (input.isEmpty()) {
                input = scanner.nextLine();
            }

            switch (input) {
                case "1":
                    flightControl.printPlanes();
                    break;
                case "2":
                    flightControl.printFlights();
                    break;
                case "3":
                    System.out.println("Give the airplane id:");
                    flightControl.printPlane(scanner.nextLine());
                    break;
                case "x":
                    return;
            }
        }
    }
}
