package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double brokerage = 0.0;
        switch (town.toLowerCase()) {
            case "sofia":
                if (0 <= sales && sales <= 500) {
                    brokerage = 0.05;
                } else if ((500 < sales) && (sales <= 1000)) {
                    brokerage = 0.07;
                } else if (1000 < sales && sales <= 10000) {
                    brokerage = 0.08;
                } else if (sales > 10000) {
                    brokerage = 0.12;
                } else {
                    System.out.println("error");
                }
                break;
            case "plovdiv":
                if (0 <= sales && sales <= 500) {
                    brokerage = 0.055;
                } else if ((500 < sales) && (sales <= 1000)) {
                    brokerage = 0.08;
                } else if (1000 < sales && sales <= 10000) {
                    brokerage = 0.12;
                } else if (sales > 10000) {
                    brokerage = 0.145;
                } else {
                    System.out.println("error");
                }
                break;
            case "varna":
                if (0 <= sales && sales <= 500) {
                    brokerage = 0.045;
                } else if ((500 < sales) && (sales <= 1000)) {
                    brokerage = 0.075;
                } else if (1000 < sales && sales <= 10000) {
                    brokerage = 0.10;
                } else if (sales > 10000) {
                    brokerage = 0.13;
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        double result = brokerage * sales;
        if (brokerage > 0) {
            System.out.printf("%.2f", result);
        }

    }
}
