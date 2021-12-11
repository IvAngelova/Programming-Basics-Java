package WhileLoops.exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double coinsInLv = Double.parseDouble(scan.nextLine());
        double coinsInCents = Math.floor(coinsInLv * 100);
        int coins = 0;
        while (coinsInCents != 0) {
            if (coinsInCents >= 200) {
                coinsInCents -= 200;
            } else if (coinsInCents >= 100) {
                coinsInCents -= 100;
            } else if (coinsInCents >= 50) {
                coinsInCents -= 50;
            } else if (coinsInCents >= 20) {
                coinsInCents -= 20;
            } else if (coinsInCents >= 10) {
                coinsInCents -= 10;
            } else if (coinsInCents >= 5) {
                coinsInCents -= 5;
            } else if (coinsInCents >= 2) {
                coinsInCents -= 2;
            } else if (coinsInCents >= 1) {
                coinsInCents -= 1;
            }
            coins++;
        }
        System.out.println(coins);

    }
}
