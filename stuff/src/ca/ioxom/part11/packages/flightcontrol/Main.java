package ca.ioxom.part11.packages.flightcontrol;

import ca.ioxom.part11.packages.flightcontrol.data.FlightControl;
import ca.ioxom.part11.packages.flightcontrol.ui.UserInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        UserInterface ui = new UserInterface(flightControl, scanner);
        ui.addAssets();
        ui.controlFlights();
    }
}
