package WhileLoops.lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (!(sum >= n)) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            sum += currentNumber;
        }
        System.out.println(sum);
    }
}
