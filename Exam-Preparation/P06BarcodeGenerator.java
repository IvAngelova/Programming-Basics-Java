package PBExams;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        int firstStart = n1 / 1000;
        int secondStart = (n1 / 100) % 10;
        int thirdStart = (n1 / 10) % 10;
        int fourthStart = n1 % 10;

        int firstEnd = n2 / 1000;
        int secondEnd = (n2 / 100) % 10;
        int thirdEnd = (n2 / 10) % 10;
        int fourthEnd = n2 % 10;

        for (int i = firstStart; i <= firstEnd; i++) {
            for (int j = secondStart; j <= secondEnd; j++) {
                for (int k = thirdStart; k <= thirdEnd; k++) {
                    for (int l = fourthStart; l <= fourthEnd; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }


}

