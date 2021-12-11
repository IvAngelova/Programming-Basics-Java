package PBExams;

import java.util.Scanner;

public class P04GameNumberWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String player1 = scan.nextLine();
        String player2 = scan.nextLine();
        String input = scan.nextLine();
        int points1 = 0;
        int points2 = 0;
        String winner = "";
        int winnerPoints = 0;
        boolean isNumberWars = false;
        while (!input.equals("End of game")) {
            int card1 = Integer.parseInt(input);
            int card2 = Integer.parseInt(scan.nextLine());
            int diff = Math.abs(card1 - card2);
            if (card1 > card2) {
                points1 += diff;
            } else if (card2 > card1) {
                points2 += diff;
            } else {
                System.out.println("Number wars!");
                card1 = Integer.parseInt(scan.nextLine());
                card2 = Integer.parseInt(scan.nextLine());
                isNumberWars = true;
                if (card1 > card2) {
                    winner = player1;
                    winnerPoints = points1;
                } else if (card1 < card2) {
                    winner = player2;
                    winnerPoints = points2;
                }
                break;
            }
            input = scan.nextLine();
        }
        if (isNumberWars) {
            System.out.printf("%s is winner with %d points", winner, winnerPoints);
        } else {
            System.out.printf("%s has %d points%n", player1, points1);
            System.out.printf("%s has %d points%n", player2, points2);
        }
    }
}
