package ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowers = scan.nextLine();
        int numFlowers = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        switch (flowers.toLowerCase()) {
            case "roses":
                price = 5.00 * numFlowers;
                if (numFlowers > 80) {
                    price = price * 0.90;
                }
                break;
            case "dahlias":
                price = 3.80 * numFlowers;
                if (numFlowers > 90) {
                    price = price * 0.85;
                }
                break;
            case "tulips":
                price = 2.80 * numFlowers;
                if (numFlowers > 80) {
                    price = price * 0.85;
                }
                break;
            case "narcissus":
                price = 3.00 * numFlowers;
                if (numFlowers < 120) {
                    price = price * 1.15;
                }
                break;
            case "gladiolus":
                price = 2.50 * numFlowers;
                if (numFlowers < 80) {
                    price = price * 1.20;
                }
                break;
        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s " +
                    "and %.2f leva left.", numFlowers, flowers, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }

    }
}
