package NestedLoops.moreExercises;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());
        int counter = 0;
        String password = "";
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d && (a * b + c * d == m)) {
                            counter++;
                            if (counter == 4) {
                                password = String.format("%d%d%d%d", a, b, c, d);
                            }
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                        }

                    }

                }

            }

        }
        if (counter > 0) {
            System.out.println();
        }
        if (counter >= 4) {
            System.out.println("Password: " + password);
        } else {
            System.out.println("No!");
        }
    }
}
