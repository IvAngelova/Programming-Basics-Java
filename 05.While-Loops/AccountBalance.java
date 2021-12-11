package WhileLoops.lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double sum = 0.0;
        while (!input.equals("NoMoreMoney")) {
            double money = Double.parseDouble(input);
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", money);
            sum += money;
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
