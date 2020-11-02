package ca.ioxom.part4.filesanddata.sportsteam;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class sportsTeam {
    public static void main(String[] arrgs) {
        Scanner sysIn = new Scanner(System.in);
        System.out.println("name of the file:");
        String file = sysIn.nextLine();
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("stuff/src/ca/ioxom/part4/filesanddata/sportsteam/" + file))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("reading the file " + file + " failed.");
        }
        System.out.println("team:");
        String team = sysIn.nextLine();
        int games = 0;
        int wins = 0;
        for (String s : list) {
            //key: 0, team name; 1, opposing team; 2, home team score; 3, opposing team score
            if (s.split(",")[0].equals(team)) {
                games++;
                if (Integer.parseInt(s.split(",")[2]) > Integer.parseInt(s.split(",")[3])) {
                    wins++;
                }
            }
        }
        System.out.println("Games: " + games + "\nWins: " + wins + "\nLosses: " + (games - wins));
    }
}
