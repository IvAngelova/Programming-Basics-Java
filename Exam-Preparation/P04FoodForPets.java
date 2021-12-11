package PBExams;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double food = Double.parseDouble(scan.nextLine());
        double sumDog = 0.0;
        double sumCat = 0.0;
        double biscuits = 0.0;
        for (int i = 1; i <= days; i++) {
            int eatenFoodDog = Integer.parseInt(scan.nextLine());
            int eatenFoodCat = Integer.parseInt(scan.nextLine());
            if (i % 3 == 0) {
                double currentBiscuits = 0.1 * (eatenFoodCat + eatenFoodDog);
                biscuits += currentBiscuits;
            }
            sumDog += eatenFoodDog;
            sumCat += eatenFoodCat;
        }
        double totalFoodEaten = sumCat + sumDog;
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", (totalFoodEaten / food) * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", (sumDog / totalFoodEaten) * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", (sumCat / totalFoodEaten) * 100);

    }
}
