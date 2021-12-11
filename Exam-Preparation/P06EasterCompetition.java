package PBExams;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sweetBreads = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        String winnerBaker = "";
        for (int i = 0; i < sweetBreads; i++) {
            int totalPoints = 0;
            String baker = scan.nextLine();
            String input = scan.nextLine();
            while (!input.equals("Stop")) {
                int points = Integer.parseInt(input);
                totalPoints += points;
                input = scan.nextLine();
            }
            System.out.printf("%s has %d points.%n", baker, totalPoints);
            if (totalPoints > max) {
                max = totalPoints;
                winnerBaker = baker;
                System.out.printf("%s is the new number 1!%n", baker);
            }
        }
        System.out.printf("%s won competition with %d points!", winnerBaker, max);
    }
}
