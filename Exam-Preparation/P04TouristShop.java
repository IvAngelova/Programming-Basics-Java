package PBExams;

import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String name = scan.nextLine();
        int boughtProducts = 0;
        double sumOfProducts = 0.0;
        boolean isWithoutMoney = false;
        while (!name.equals("Stop")) {
            double price = Double.parseDouble(scan.nextLine());
            boughtProducts++;
            if (boughtProducts % 3 == 0) {
                price /= 2;
            }
            budget -= price;
            if (budget < 0) {
                isWithoutMoney = true;
                break;
            }
            sumOfProducts += price;
            name = scan.nextLine();
        }
        if (isWithoutMoney) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(budget));
        } else {
            System.out.printf("You bought %d products for %.2f leva.", boughtProducts, sumOfProducts);
        }
    }
}
