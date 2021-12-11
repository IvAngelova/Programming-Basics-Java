package NestedLoops.lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int begin = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int counter = 0;
        boolean isFound = false;
        for (int i = begin; i <= end; i++) {
            if (isFound) {
                break;
            }
            for (int j = begin; j <= end; j++) {
                int sum = i + j;
                counter++;
                if (sum == magicNumber) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, sum);
                    break;
                }
            }

        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
