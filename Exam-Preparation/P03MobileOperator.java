package PBExams;

import java.util.Scanner;

public class P03MobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String term = scan.nextLine();
        String type = scan.nextLine();
        String extraInternet = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        if (term.equals("one")) {
            switch (type.toLowerCase()) {
                case "small":
                    price = 9.98;
                    break;
                case "middle":
                    price = 18.99;
                    break;
                case "large":
                    price = 25.98;
                    break;
                case "extralarge":
                    price = 35.99;
                    break;
            }
        } else if (term.equals("two")) {
            switch (type.toLowerCase()) {
                case "small":
                    price = 8.58;
                    break;
                case "middle":
                    price = 17.09;
                    break;
                case "large":
                    price = 23.59;
                    break;
                case "extralarge":
                    price = 31.79;
                    break;
            }
        }
        if (extraInternet.equals("yes")) {
            if (price <= 10) {
                price += 5.50;
            } else if (price <= 30) {
                price += 4.35;
            } else {
                price += 3.85;
            }
        }
        double totalSum = price * months;
        if (term.equals("two")) {
            System.out.printf("%.2f lv.", totalSum * 0.9625);
        } else {
            System.out.printf("%.2f lv.", totalSum);
        }
    }
}
