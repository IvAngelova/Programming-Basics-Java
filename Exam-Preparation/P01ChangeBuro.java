package PBExams;

import java.util.Scanner;

public class P01ChangeBuro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int btc = Integer.parseInt(scan.nextLine());
        double yuan = Double.parseDouble(scan.nextLine());
        double brokerage = Double.parseDouble(scan.nextLine());
        double sumInLeva = ((yuan * 0.15) * 1.76) + (btc * 1168);
        double sumInEuroWithBrokerage = (sumInLeva / 1.95) * (1 - brokerage / 100);
        System.out.printf("%.2f", sumInEuroWithBrokerage);
    }
}
