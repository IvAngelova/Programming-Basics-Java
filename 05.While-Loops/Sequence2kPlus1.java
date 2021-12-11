package WhileLoops.lab;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int currentNumber = 1;
        while (currentNumber <= n) {
            System.out.println(currentNumber);
            currentNumber = 2 * currentNumber + 1;
        }
    }
}
