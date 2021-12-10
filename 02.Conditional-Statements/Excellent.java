package ConditionalStatements.Lab;

import java.util.Scanner;

public class Excellent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        if (a >= 5) {
            System.out.println("Excellent!");
        }
    }
}
