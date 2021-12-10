package ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int overnights = Integer.parseInt(scan.nextLine());
        double priceStudio = 0.0;
        double priceApartment = 0.0;
        switch (month.toLowerCase()) {
            case "may":
            case "october":
                priceStudio = 50.0 * overnights;
                priceApartment = 65.0 * overnights;
                if (overnights > 7 && overnights <= 14) {
                    priceStudio = priceStudio * 0.95;
                } else if (overnights > 14) {
                    priceStudio = priceStudio * 0.7;
                    priceApartment = priceApartment * 0.9;
                }
                break;
            case "june":
            case "september":
                priceStudio = 75.20 * overnights;
                priceApartment = 68.70 * overnights;
                if (overnights > 14) {
                    priceStudio = priceStudio * 0.80;
                    priceApartment = priceApartment * 0.9;
                }
                break;
            case "july":
            case "august":
                priceStudio = 76.00 * overnights;
                priceApartment = 77.00 * overnights;
                if (overnights > 14) {
                    priceApartment = priceApartment * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv. %n" +
                "Studio: %.2f lv.", priceApartment, priceStudio);
    }
}
