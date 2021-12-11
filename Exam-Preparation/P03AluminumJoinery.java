package PBExams;

import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int joinery = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String delivery = scan.nextLine();
        double price = 0.0;
        switch (type) {
            case "90X130":
                price = 110 * joinery;
                if (joinery > 30 && joinery <= 60) {
                    price *= 0.95;
                } else if (joinery > 60) {
                    price *= 0.92;
                }
                break;
            case "100X150":
                price = 140 * joinery;
                if (joinery > 40 && joinery <= 80) {
                    price *= 0.94;
                } else if (joinery > 80) {
                    price *= 0.9;
                }
                break;
            case "130X180":
                price = 190 * joinery;
                if (joinery > 20 && joinery <= 50) {
                    price *= 0.93;
                } else if (joinery > 50) {
                    price *= 0.88;
                }
                break;
            case "200X300":
                price = 250 * joinery;
                if (joinery > 25 && joinery <= 50) {
                    price *= 0.91;
                } else if (joinery > 50) {
                    price *= 0.86;
                }
                break;
        }
        if (delivery.equalsIgnoreCase("With delivery")) {
            price += 60;
        }
        if (joinery > 99) {
            price *= 0.96;
        }
        if (joinery <= 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", price);
        }

    }
}
