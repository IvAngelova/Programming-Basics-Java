package ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int result = 0;

        switch (operator) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", n1, operator, n2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", n1, operator, n2, result);
                }
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", n1, operator, n2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", n1, operator, n2, result);
                }
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", n1, operator, n2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", n1, operator, n2, result);
                }
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double result1 = n1 / (n2 * 1.0);
                    System.out.printf("%d %s %d = %.2f", n1, operator, n2, result1);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %s %d = %d", n1, operator, n2, result);
                }
                break;
        }
    }
}
