package ca.ioxom.part11.packages.mooc;

import ca.ioxom.part11.packages.mooc.logic.ApplicationLogic;
import ca.ioxom.part11.packages.mooc.ui.UserInterface;
import ca.ioxom.part11.packages.mooc.ui.TextInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
