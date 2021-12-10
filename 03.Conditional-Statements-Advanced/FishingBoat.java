package ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishingMen = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        switch (season.toLowerCase()) {
            case "spring":
                price = 3000;
                if (fishingMen <= 6) {
                    price = price * 0.9;
                } else if (fishingMen <= 11) {
                    price = price * 0.85;
                } else {
                    price = price * 0.75;
                }
                break;
            case "summer":
            case "autumn":
                price = 4200;
                if (fishingMen <= 6) {
                    price = price * 0.9;
                } else if (fishingMen <= 11) {
                    price = price * 0.85;
                } else {
                    price = price * 0.75;
                }
                break;
            case "winter":
                price = 2600;
                if (fishingMen <= 6) {
                    price = price * 0.9;
                } else if (fishingMen <= 11) {
                    price = price * 0.85;
                } else {
                    price = price * 0.75;
                }
                break;
        }
        if (fishingMen % 2 == 0 && !(season.equalsIgnoreCase("autumn"))) {
            price = price * 0.95;
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
