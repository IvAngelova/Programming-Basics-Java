package NestedLoops.moreExercises;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startFirstCouple = Integer.parseInt(scan.nextLine());
        int startSecondCouple = Integer.parseInt(scan.nextLine());
        int diff1 = Integer.parseInt(scan.nextLine());
        int diff2 = Integer.parseInt(scan.nextLine());
        int endFirstCouple = startFirstCouple + diff1;
        int endSecondCouple = startSecondCouple + diff2;
        for (int i = startFirstCouple; i <= endFirstCouple; i++) {
            for (int k = startSecondCouple; k <= endSecondCouple; k++) {
                // Проверяваме всяка двойка по отделно, дали е просто или непросто число
                boolean firstCheck = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        firstCheck = false;
                        break;
                    }
                }
                boolean secondCheck = true;
                for (int l = 2; l < k; l++) {
                    if (k % l == 0) {
                        secondCheck = false;
                        break;
                    }
                }

                if (firstCheck && secondCheck) {
                    System.out.printf("%d%d%n", i, k);
                }
            }

        }

    }

}


