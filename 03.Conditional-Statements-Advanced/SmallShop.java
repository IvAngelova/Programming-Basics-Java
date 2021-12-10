package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0.0;
        if (town.equalsIgnoreCase("Sofia")) {
            switch (product.toLowerCase()) {
                case "coffee":
                    price = quantity * 0.5;
                    break;
                case "water":
                    price = quantity * 0.8;
                    break;
                case "beer":
                    price = quantity * 1.20;
                    break;
                case "sweets":
                    price = quantity * 1.45;
                    break;
                case "peanuts":
                    price = quantity * 1.60;
                    break;
            }

        } else if (town.equalsIgnoreCase("Plovdiv")) {
            switch (product.toLowerCase()) {
                case "coffee":
                    price = quantity * 0.4;
                    break;
                case "water":
                    price = quantity * 0.7;
                    break;
                case "beer":
                    price = quantity * 1.15;
                    break;
                case "sweets":
                    price = quantity * 1.30;
                    break;
                case "peanuts":
                    price = quantity * 1.50;
                    break;
            }

        } else if (town.equalsIgnoreCase("Varna")) {
            switch (product.toLowerCase()) {
                case "coffee":
                    price = quantity * 0.45;
                    break;
                case "water":
                    price = quantity * 0.7;
                    break;
                case "beer":
                    price = quantity * 1.10;
                    break;
                case "sweets":
                    price = quantity * 1.35;
                    break;
                case "peanuts":
                    price = quantity * 1.55;
                    break;
            }

        }

        System.out.println(price);
    }
}
