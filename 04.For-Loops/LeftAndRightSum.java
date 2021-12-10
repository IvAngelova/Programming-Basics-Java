package ForLoops.lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < 2 * n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (i < n) {
                leftSum += number;
            } else {
                rightSum += number;
            }
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
