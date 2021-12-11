package NestedLoops.moreExercises;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int endFirstNum = Integer.parseInt(scan.nextLine());
        int endSecondNum = Integer.parseInt(scan.nextLine());
        int endThirdNum = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= endFirstNum; i++) {
            for (int j = 2; j <= endSecondNum; j++) {
                for (int k = 2; k <= endThirdNum; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }

            }

        }

    }
}
