package PBExams;

import java.util.Scanner;

public class P05GameShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soldGames = Integer.parseInt(scan.nextLine());
        int hearthstone = 0;
        int fornite = 0;
        int overwatch = 0;
        int others = 0;
        for (int i = 0; i < soldGames; i++) {
            String name = scan.nextLine();
            switch (name) {
                case "Hearthstone":
                    hearthstone++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    overwatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", hearthstone * 1.0 / soldGames * 100);
        System.out.printf("Fornite - %.2f%%%n", fornite * 1.0 / soldGames * 100);
        System.out.printf("Overwatch - %.2f%%%n", overwatch * 1.0 / soldGames * 100);
        System.out.printf("Others - %.2f%%", others * 1.0 / soldGames * 100);
    }
}
