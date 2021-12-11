package NestedLoops.moreExercises;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int men = Integer.parseInt(scan.nextLine());
        int women = Integer.parseInt(scan.nextLine());
        int tables = Integer.parseInt(scan.nextLine());
        int counter = 0;
        label:
        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                counter++;
                System.out.printf("(%d <-> %d) ", i, j);
                if (counter == tables) {
                    break label;
                }

            }

        }
    }
}
