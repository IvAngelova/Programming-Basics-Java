package PBExams;

import java.util.Scanner;

public class P04EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggsPlayer1 = Integer.parseInt(scan.nextLine());
        int eggsPlayer2 = Integer.parseInt(scan.nextLine());
        String winner = scan.nextLine();
        while (!winner.equals("End of battle")) {
            if (winner.equals("one")) {
                eggsPlayer2 -= 1;
                if (eggsPlayer2 == 0) {
                    System.out.printf("Player two is out of eggs. " +
                            "Player one has %d eggs left.", eggsPlayer1);
                    break;
                }
            } else if (winner.equals("two")) {
                eggsPlayer1 -= 1;
                if (eggsPlayer1 == 0) {
                    System.out.printf("Player one is out of eggs. " +
                            "Player two has %d eggs left.", eggsPlayer2);
                    break;
                }
            }
            winner = scan.nextLine();
        }
        if (winner.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.%n", eggsPlayer1);
            System.out.printf("Player two has %d eggs left.%n", eggsPlayer2);
        }
    }
}
