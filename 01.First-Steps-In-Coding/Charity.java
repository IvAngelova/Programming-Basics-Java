package FirstStepsInCoding;

import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int bakers = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double sumCakes = cakes * 45;
        double sumWaffles = waffles * 5.80;
        double sumPancakes = pancakes * 3.20;
        double sumDay = (sumPancakes + sumCakes + sumWaffles) * bakers;
        double result = (sumDay * days) - ((sumDay * days) * 1 / 8);

        System.out.printf("%.2f", result);

    }
}
