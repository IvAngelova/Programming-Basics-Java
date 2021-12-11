package NestedLoops.lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        double sumSavedMoney = 0;
        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scan.nextLine());
            while (sumSavedMoney < minBudget) {
                double savedMoney = Double.parseDouble(scan.nextLine());
                sumSavedMoney += savedMoney;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scan.nextLine();
            sumSavedMoney = 0;
        }

    }
}
