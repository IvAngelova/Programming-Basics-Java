package ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        double expenses = 0.0;
        String destination = "";
        String place = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season.toLowerCase()) {
                case "summer":
                    place = "Camp";
                    expenses = budget * 0.3;
                    break;
                case "winter":
                    place = "Hotel";
                    expenses = budget * 0.7;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season.toLowerCase()) {
                case "summer":
                    place = "Camp";
                    expenses = budget * 0.4;
                    break;
                case "winter":
                    place = "Hotel";
                    expenses = budget * 0.8;
                    break;
            }
        } else {
            destination = "Europe";
            place = "Hotel";
            expenses = budget * 0.9;
        }
        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", place, expenses);


    }
}
