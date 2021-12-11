package PBExams;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balls = Integer.parseInt(scan.nextLine());
        int points = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;

        for (int i = 1; i <= balls; i++) {
            String color = scan.nextLine();
            switch (color) {
                case "red":
                    points += 5;
                    redBalls++;
                    break;
                case "orange":
                    points += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    points += 15;
                    yellowBalls++;
                    break;
                case "white":
                    points += 20;
                    whiteBalls++;
                    break;
                case "black":
                    points = points / 2;
                    blackBalls++;
                    break;
                default:
                    otherBalls++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Points from red balls: %d%n", redBalls);
        System.out.printf("Points from orange balls: %d%n", orangeBalls);
        System.out.printf("Points from yellow balls: %d%n", yellowBalls);
        System.out.printf("Points from white balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d%n", blackBalls);

    }
}
