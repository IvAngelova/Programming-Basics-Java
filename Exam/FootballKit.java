package PreExam;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tShirt = Double.parseDouble(scan.nextLine());
        double sumNeededForBall = Double.parseDouble(scan.nextLine());
        double shorts = tShirt * 0.75;
        double socks = shorts * 0.20;
        double buttons = (tShirt + shorts) * 2;
        double sumWithDiscount = (tShirt + shorts + socks + buttons) * 0.85;
        if (sumWithDiscount >= sumNeededForBall) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sumWithDiscount);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", sumNeededForBall - sumWithDiscount);
        }
    }
}
