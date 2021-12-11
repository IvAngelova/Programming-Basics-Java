package PBExams;

import java.util.Scanner;

public class P06VetParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double fee = 0.0;
        double feeAllDays = 0.0;
        for (int i = 1; i <= days; i++) {
            double feePerDay = 0.0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    fee = 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    fee = 1.25;
                } else {
                    fee = 1.0;
                }
                feePerDay += fee;
            }
            feeAllDays += feePerDay;
            System.out.printf("Day: %d - %.2f leva\n", i, feePerDay);
        }
        System.out.printf("Total: %.2f leva", feeAllDays);
    }
}
