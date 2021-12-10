package ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        int p = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());

        double games = (48 - h) * 3.0 / 4 + h + 2.0 / 3 * p;
        if (year.equalsIgnoreCase("leap")) {
            games = games * 1.15;
        }
        games = Math.floor(games);
        System.out.printf("%.0f", games);
    }
}
