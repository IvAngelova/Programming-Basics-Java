package PreExam;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seaCounter = Integer.parseInt(scan.nextLine());
        int mountainCounter = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int price = 0;
        int totalSum = 0;
        boolean isSold = false;
        while (!input.equals("Stop")) {
            if (input.equals("sea")) {
                price = 680;
                if (seaCounter > 0) {
                    totalSum += price;
                    seaCounter--;
                }
            } else if (input.equals("mountain")) {
                price = 499;
                if (mountainCounter > 0) {
                    totalSum += price;
                    mountainCounter--;
                }
            }
            if (seaCounter == 0 && mountainCounter == 0) {
                isSold = true;
                break;
            }
            input = scan.nextLine();
        }
        if (isSold) {
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %d leva.", totalSum);
        } else {
            System.out.printf("Profit: %d leva.", totalSum);
        }

    }
}
