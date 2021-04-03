package ca.ioxom.part11.diagrams;

import java.util.ArrayList;

public class Bot extends Player {
    private ArrayList<String> moves;

    @Override
    public void play() {
        //
    }

    public void addMove(String move) {
        moves.add(move);
    }
}
