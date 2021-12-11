package NestedLoops.moreExercises;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coins1Lv = Integer.parseInt(scan.nextLine());
        int coins2Lv = Integer.parseInt(scan.nextLine());
        int banknote5Lv = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= coins1Lv; i++) {
            for (int j = 0; j <= coins2Lv; j++) {
                for (int k = 0; k <= banknote5Lv; k++) {
                    if (i * 1 + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }

            }

        }
    }
}
