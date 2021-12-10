package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
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
                        System.out.printf("%.2f", price);
                        break;
                    case "apple":
                        price = 1.20 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "orange":
                        price = 0.85 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapefruit":
                        price = 1.45 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "kiwi":
                        price = 2.70 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "pineapple":
                        price = 5.50 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapes":
                        price = 3.85 * quantity;
                        System.out.printf("%.2f", price);
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
                        System.out.printf("%.2f", price);
                        break;
                    case "apple":
                        price = 1.25 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "orange":
                        price = 0.9 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapefruit":
                        price = 1.60 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "kiwi":
                        price = 3.00 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "pineapple":
                        price = 5.60 * quantity;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapes":
                        price = 4.20 * quantity;
                        System.out.printf("%.2f", price);
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
    }
}
