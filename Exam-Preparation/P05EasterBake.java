package PBExams;

import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sugarBreads = Integer.parseInt(scan.nextLine());
        double allSugar = 0.0;
        double allFlour = 0.0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;
        for (int i = 0; i < sugarBreads; i++) {
            int sugar = Integer.parseInt(scan.nextLine());
            int flour = Integer.parseInt(scan.nextLine());
            allSugar += sugar;
            allFlour += flour;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }
        System.out.printf("Sugar: %.0f%n", Math.ceil(allSugar / 950));
        System.out.printf("Flour: %.0f%n", Math.ceil(allFlour / 750));
        System.out.printf("Max used flour is %d grams," +
                " max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
