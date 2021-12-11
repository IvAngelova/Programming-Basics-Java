package PBExams;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double capacity = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        int counterEveryThird = 0;
        int suitcasesLoad = 0;
        boolean isFull = false;
        while (!input.equals("End")) {
            double volumeSuitcase = Double.parseDouble(input);
            counterEveryThird++;
            if (counterEveryThird % 3 == 0) {
                volumeSuitcase *= 1.10;
            }
            if (capacity < volumeSuitcase) {
                isFull = true;
                break;
            }
            capacity -= volumeSuitcase;
            suitcasesLoad++;
            input = scan.nextLine();
        }

        if (isFull) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcasesLoad);
    }
}
