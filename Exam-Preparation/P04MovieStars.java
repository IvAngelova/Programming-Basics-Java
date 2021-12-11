package PBExams;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String name = scan.nextLine();
        double reward;
        boolean isNotEnough = false;
        while (!name.equals("ACTION")) {
            if (name.length() <= 15) {
                reward = Double.parseDouble(scan.nextLine());
            } else {
                reward = 0.2 * budget;
            }
            budget -= reward;
            if (budget < 0) {
                isNotEnough = true;
                break;
            }
            name = scan.nextLine();
        }
        if (isNotEnough) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
