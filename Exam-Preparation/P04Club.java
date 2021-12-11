package PBExams;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double incomeWanted = Double.parseDouble(scan.nextLine());
        String name = scan.nextLine();
        double income = 0.0;
        boolean isAchieved = false;
        while (!name.equals("Party!")) {
            int numberCocktails = Integer.parseInt(scan.nextLine());
            int priceCurrentCocktail = name.length();
            double order = numberCocktails * priceCurrentCocktail;
            if (order % 2 != 0) {
                order *= 0.75;
            }
            income += order;
            if (income >= incomeWanted) {
                isAchieved = true;
                break;
            }
            name = scan.nextLine();
        }
        if (isAchieved) {
            System.out.println("Target acquired.");
        } else {
            System.out.printf("We need %.2f leva more.%n", incomeWanted - income);
        }
        System.out.printf("Club income - %.2f leva.", income);

    }
}
