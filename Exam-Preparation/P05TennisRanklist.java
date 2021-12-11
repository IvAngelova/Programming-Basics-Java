package PBExams;

import java.util.Scanner;

public class P05TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tournaments = Integer.parseInt(scan.nextLine());
        int startPoints = Integer.parseInt(scan.nextLine());
        int points = 0;
        int winner = 0;
        for (int i = 0; i < tournaments; i++) {
            String text = scan.nextLine();
            switch (text) {
                case "W":
                    winner++;
                    points += 2000;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        int totalPoints = points + startPoints;
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(points * 1.00 / tournaments));
        System.out.printf("%.2f%%", winner * 1.00 / tournaments * 100);
    }
}
