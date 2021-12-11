package NestedLoops.moreExercises;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int maxPasswords = Integer.parseInt(scan.nextLine());
        int combinations = 0;
        char A = (char) 35;
        char B = (char) 64;
        label:
        for (int k = 1; k <= a; k++) {
            for (int l = 1; l <= b; l++) {
                combinations++;
                if (combinations > maxPasswords) {
                    break label;
                }
                System.out.printf("%c%c%d%d%c%c|", A, B, k, l, B, A);
                A++;
                B++;
                if (A > 55) {
                    A = (char) 35;
                }
                if (B > 96) {
                    B = (char) 64;
                }
            }

        }

    }

}



