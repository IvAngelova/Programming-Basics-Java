package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String note = scan.nextLine();

        int overnight = days - 1;
        double price = 0.0;

        switch (room.toLowerCase()) {
            case "room for one person":
                price = 18.00 * overnight;
                break;
            case "apartment":
                if (days < 10) {
                    price = (25.00 * overnight) * 0.70;
                } else if (days <= 15) {
                    price = (25.00 * overnight) * 0.65;
                } else {
                    price = (25.00 * overnight) * 0.50;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = (35.00 * overnight) * 0.90;
                } else if (days <= 15) {
                    price = (35.00 * overnight) * 0.85;
                } else {
                    price = (35.00 * overnight) * 0.80;
                }
                break;
        }

        if (note.equalsIgnoreCase("positive")) {
            price = price + (price * 0.25);
        } else {
            price = price - (price * 0.10);
        }
        System.out.printf("%.2f", price);

    }
}
