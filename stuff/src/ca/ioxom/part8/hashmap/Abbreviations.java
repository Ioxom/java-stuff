package ca.ioxom.part8.hashmap;

import java.util.HashMap;

public class Abbreviations {
    public HashMap<String, String> abbreviationList;
    public Abbreviations() {
        this.abbreviationList = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationList.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviationList.get(abbreviation) != null;
    }

    public String findExplanationFor(String abbreviation) {
        if (this.abbreviationList.get(abbreviation) == null) return null;
        return this.abbreviationList.get(abbreviation);
    }

    public static void main(String[] arrgs) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
