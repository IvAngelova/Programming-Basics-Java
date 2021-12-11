package PBExams;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int foodInKg = Integer.parseInt(scan.nextLine());
        int foodInGrams = foodInKg * 1000;
        String input = scan.nextLine();
        while (!input.equals("Adopted")) {
            int foodEaten = Integer.parseInt(input);
            foodInGrams -= foodEaten;
            input = scan.nextLine();
        }
        if (foodInGrams >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodInGrams));
        }
    }
}
