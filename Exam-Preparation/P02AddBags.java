package PBExams;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceBagsOver20Kg = Double.parseDouble(scan.nextLine());
        double kgBags = Double.parseDouble(scan.nextLine());
        int daysLeftToTrip = Integer.parseInt(scan.nextLine());
        int bags = Integer.parseInt(scan.nextLine());

        if (kgBags < 10) {
            priceBagsOver20Kg *= 0.2;
        } else if (kgBags <= 20) {
            priceBagsOver20Kg *= 0.5;
        }

        if (daysLeftToTrip < 7) {
            priceBagsOver20Kg *= 1.40;
        } else if (daysLeftToTrip <= 30) {
            priceBagsOver20Kg *= 1.15;
        } else {
            priceBagsOver20Kg *= 1.10;
        }

        double allToPay = bags * priceBagsOver20Kg;
        System.out.printf("The total price of bags is: %.2f lv. ", allToPay);

    }
}
