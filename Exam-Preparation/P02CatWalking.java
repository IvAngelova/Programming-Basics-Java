package PBExams;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutesOfWalking = Integer.parseInt(scan.nextLine());
        int numberOfWalking = Integer.parseInt(scan.nextLine());
        int calories = Integer.parseInt(scan.nextLine());
        int minutesTotal = minutesOfWalking * numberOfWalking;
        int burnedCalories = 5 * minutesTotal;
        double mustToBurn = 0.5 * calories;
        if (burnedCalories < mustToBurn) {
            System.out.printf("No, the walk for your cat is not enough. " +
                    "Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("Yes, the walk for your cat is enough." +
                    " Burned calories per day: %d.", burnedCalories);
        }
    }
}
