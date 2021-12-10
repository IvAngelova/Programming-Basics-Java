package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShopSecondSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0.0;
        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                switch (fruit.toLowerCase()) {
                    case "banana":
                        price = 2.50 * quantity;
                        break;
                    case "apple":
                        price = 1.20 * quantity;
                        break;
                    case "orange":
                        price = 0.85 * quantity;
                        break;
                    case "grapefruit":
                        price = 1.45 * quantity;
                        break;
                    case "kiwi":
                        price = 2.70 * quantity;
                        break;
                    case "pineapple":
                        price = 5.50 * quantity;
                        break;
                    case "grapes":
                        price = 3.85 * quantity;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "saturday":
            case "sunday":
                switch (fruit.toLowerCase()) {
                    case "banana":
                        price = 2.70 * quantity;
                        break;
                    case "apple":
                        price = 1.25 * quantity;
                        break;
                    case "orange":
                        price = 0.9 * quantity;
                        break;
                    case "grapefruit":
                        price = 1.60 * quantity;
                        break;
                    case "kiwi":
                        price = 3.00 * quantity;
                        break;
                    case "pineapple":
                        price = 5.60 * quantity;
                        break;
                    case "grapes":
                        price = 4.20 * quantity;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        if (price > 0) {
            System.out.printf("%.2f", price);
        }
    }
}
