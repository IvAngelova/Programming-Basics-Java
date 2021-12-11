package PBExams;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int ticketsAdults = Integer.parseInt(scan.nextLine());
        int ticketsKids = Integer.parseInt(scan.nextLine());
        double priceAdult = Double.parseDouble(scan.nextLine());
        double fee = Double.parseDouble(scan.nextLine());

        double priceKid = (priceAdult * 0.3) + fee;
        priceAdult = priceAdult + fee;
        double allTicketsPrice = ticketsAdults * priceAdult + ticketsKids * priceKid;
        double profit = allTicketsPrice * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, profit);

    }
}
