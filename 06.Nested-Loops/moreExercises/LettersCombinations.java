package NestedLoops.moreExercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String begin = scan.nextLine();
        String end = scan.nextLine();
        String letterToMiss = scan.nextLine();
        char beginNum = begin.charAt(0);
        char endNum = end.charAt(0);
        char numToMiss = letterToMiss.charAt(0);
        int combinations = 0;
        for (char i = beginNum; i <= endNum; i++) {
            for (char j = beginNum; j <= endNum; j++) {
                for (char k = beginNum; k <= endNum; k++) {
                    if (i != numToMiss && j != numToMiss && k != numToMiss) {
                        combinations++;
                        System.out.printf("%c%c%c ", i, j, k);

                    }

                }

            }

        }
        System.out.printf("%d", combinations);
    }
}
