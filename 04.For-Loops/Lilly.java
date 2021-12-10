package ForLoops.lab;

import java.util.Scanner;

public class Lilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double priceWashMachine = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        double money = 0.0;
        double currentBDayMoney = 10.00;
        int counter = 0;
        int toys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += currentBDayMoney;
                currentBDayMoney += 10.00;
                counter++;
            } else {
                toys++;
            }
        }
        double totalSum = toys * toyPrice + (money - 1.00 * counter);
        if (totalSum >= priceWashMachine) {
            System.out.printf("Yes! %.2f", totalSum - priceWashMachine);
        } else {
            System.out.printf("No! %.2f", priceWashMachine - totalSum);
        }
    }
}
