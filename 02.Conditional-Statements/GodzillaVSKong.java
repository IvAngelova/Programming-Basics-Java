package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double clothePrice = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.10;
        double clotheSum = people * clothePrice;
        if (people > 150) {
            clotheSum = clotheSum - clotheSum * 0.10;
        }
        double sumFilm = decor + clotheSum;
        if (sumFilm > budget) {
            double moneyNeeded = sumFilm - budget;
            System.out.printf("Not enough money! %n" +
                    "Wingard needs %.2f leva more.", moneyNeeded);
        } else if (sumFilm <= budget) {
            double leftMoney = budget - sumFilm;
            System.out.printf("Action! %n" +
                    "Wingard starts filming with %.2f leva left.", leftMoney);
        }
    }
}
