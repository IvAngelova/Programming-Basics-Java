package NestedLoops.moreExercises;

import java.util.Scanner;

public class SecretDoorLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stotici = Integer.parseInt(scan.nextLine());
        int decetici = Integer.parseInt(scan.nextLine());
        int edinici = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= stotici; i++) {
            for (int j = 2; j <= decetici; j++) {
                for (int k = 2; k <= edinici; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }

                }

            }

        }
    }
}
