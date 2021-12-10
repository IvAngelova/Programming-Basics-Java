package ForLoops.exercise;

import java.util.Scanner;

public class DivisionWithoutReminder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number % 2 == 0) {
                p1++;
            }
            if (number % 3 == 0) {
                p2++;
            }
            if (number % 4 == 0) {
                p3++;
            }
        }
        double p1Percent = 1.00 * p1 / n * 100;
        double p2Percent = 1.00 * p2 / n * 100;
        double p3Percent = 1.00 * p3 / n * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
    }
}
