package ForLoops.exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }
        }
        int sumWithoutMax = sum - max;
        if (sumWithoutMax == max) {
            System.out.printf("Yes\n" +
                    "Sum = %d\n", max);
        } else {
            System.out.printf("No\n" +
                    "Diff = %d\n", Math.abs(sumWithoutMax - max));
        }
    }
}
