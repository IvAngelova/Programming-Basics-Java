package PBExams;

import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int games = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int win = 0;
        int lose = 0;
        int equal = 0;
        for (int i = 0; i < games; i++) {
            String result = scan.nextLine();
            switch (result) {
                case "W":
                    sum += 3;
                    win++;
                    break;
                case "D":
                    sum += 1;
                    equal++;
                    break;
                case "L":
                    lose++;
                    break;
            }
        }
        if (games == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
        } else {
            System.out.printf("%s has won %d points during this season.%n", name, sum);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", win);
            System.out.printf("## D: %d%n", equal);
            System.out.printf("## L: %d%n", lose);
            System.out.printf("Win rate: %.2f%%", (win * 1.00 / games) * 100);
        }
    }
}
