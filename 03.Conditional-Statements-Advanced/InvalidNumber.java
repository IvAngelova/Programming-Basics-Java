package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        boolean isValid = (a <= 200) && (a >= 100) || (a == 0);
        if (!isValid) {
            System.out.println("invalid");
        }
    }
}
