package PBExams;

import java.util.Scanner;

public class P04EasterShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggs = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        boolean notEnough = false;
        int eggsSold = 0;
        while (!command.equals("Close")) {
            int numberToBuyOrFill = Integer.parseInt(scan.nextLine());
            if (command.equals("Buy")) {
                if (eggs < numberToBuyOrFill) {
                    notEnough = true;
                    break;
                }
                eggs -= numberToBuyOrFill;
                eggsSold += numberToBuyOrFill;
            } else if (command.equals("Fill")) {
                eggs += numberToBuyOrFill;
            }
            command = scan.nextLine();
        }
        if (notEnough) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", eggs);
        } else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", eggsSold);
        }
    }
}
