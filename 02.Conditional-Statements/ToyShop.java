package ConditionalStatements.Lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double holidayPrice = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double totalSoldToys = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int toys = puzzles + dolls + bears + minions + trucks;
        if (toys >= 50) {
            totalSoldToys = totalSoldToys - (totalSoldToys * 0.25);
        }
        totalSoldToys = totalSoldToys - (totalSoldToys * 0.1);

        if (totalSoldToys >= holidayPrice) {
            double leftMoney = totalSoldToys - holidayPrice;
            System.out.printf("Yes! %.2f lv left.", leftMoney);
        } else {
            double moneyNeeded = holidayPrice - totalSoldToys;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }


    }
}
