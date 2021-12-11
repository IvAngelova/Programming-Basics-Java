package PBExams;

import java.util.Scanner;

public class P02FootballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int win = 0;
        int lose = 0;
        int equals = 0;
        for (int i = 0; i < 3; i++) {
            String result = scan.nextLine();
            if (result.charAt(0) > result.charAt(2)) {
                win++;
            } else if (result.charAt(0) < result.charAt(2)) {
                lose++;
            } else {
                equals++;
            }
        }
        System.out.printf("Team won %d games.%n", win);
        System.out.printf("Team lost %d games.%n", lose);
        System.out.printf("Drawn games: %d", equals);

    }
}
