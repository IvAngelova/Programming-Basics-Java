package PBExams;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        double totalPrice = 0.0;
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());
            switch (name) {
                case "Thrones":
                    price /= 2;
                    break;
                case "Lucifer":
                    price *= 0.60;
                    break;
                case "Protector":
                    price *= 0.70;
                    break;
                case "TotalDrama":
                    price *= 0.80;
                    break;
                case "Area":
                    price *= 0.90;
                    break;
            }
            totalPrice += price;
        }
        if (budget >= totalPrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalPrice - budget);
        }
    }
}
