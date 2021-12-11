package PBExams;

import java.util.Scanner;

public class P06BasketballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tournamentName = scan.nextLine();
        int win = 0;
        int lose = 0;
        int games = 0;
        while (!tournamentName.equals("End of tournaments")) {
            int n = Integer.parseInt(scan.nextLine());
            for (int i = 1; i <= n; i++) {
                int pointsDesy = Integer.parseInt(scan.nextLine());
                int points = Integer.parseInt(scan.nextLine());
                games++;
                if (pointsDesy > points) {
                    win++;
                    System.out.printf("Game %d of tournament %s: win " +
                            "with %d points.%n", i, tournamentName, pointsDesy - points);
                } else if (points > pointsDesy) {
                    lose++;
                    System.out.printf("Game %d of tournament %s: lost" +
                            " with %d points.%n", i, tournamentName, points - pointsDesy);
                }

            }
            tournamentName = scan.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", win * 1.0 / games * 100);
        System.out.printf("%.2f%% matches lost%n", lose * 1.0 / games * 100);
    }
}
