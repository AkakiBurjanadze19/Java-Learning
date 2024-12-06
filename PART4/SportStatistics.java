package PART4;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner inputScanner1 = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = inputScanner1.nextLine();

        ArrayList<String> homeTeams = new ArrayList<>();
        ArrayList<String> visitingTeams = new ArrayList<>();
        ArrayList<Integer> homeTeamPoints = new ArrayList<>();
        ArrayList<Integer> visitingTeamPoints = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get("./PART4/" + fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                if (row.isEmpty()) {
                    continue;
                }

                String[] parts = row.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoint = Integer.parseInt(parts[2]);
                int visitingTeamPoint = Integer.parseInt(parts[3]);

                homeTeams.add(homeTeam);
                visitingTeams.add(visitingTeam);
                homeTeamPoints.add(homeTeamPoint);
                visitingTeamPoints.add(visitingTeamPoint);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Scanner inputScanner2 = new Scanner(System.in);

        System.out.println("Team: ");
        String teamName = inputScanner2.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        for (int i = 0; i < homeTeams.size(); i++) {
            String team = homeTeams.get(i);
            if (team.equals(teamName)) {
                gamesPlayed++;
                if (homeTeamPoints.get(i) > visitingTeamPoints.get(i)) {
                    wins++;
                }
                if (homeTeamPoints.get(i) < visitingTeamPoints.get(i)) {
                    losses++;
                }
            }
        }

        for (int i = 0; i < visitingTeams.size(); i++) {
            String team = visitingTeams.get(i);
            if (team.equals(teamName)) {
                gamesPlayed++;
                if (visitingTeamPoints.get(i) > homeTeamPoints.get(i)) {
                    wins++;
                }
                if (visitingTeamPoints.get(i) < homeTeamPoints.get(i)) {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
