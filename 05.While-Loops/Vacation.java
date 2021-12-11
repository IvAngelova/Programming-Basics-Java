package WhileLoops.exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double neededMoneyForVacation = Double.parseDouble(scan.nextLine());
        double ownedMoney = Double.parseDouble(scan.nextLine());
        int days = 0;
        int spendDays = 0;
        boolean isFailed = false;

        label:
        while (!(ownedMoney >= neededMoneyForVacation)) {
            String inputSpendOrSave = scan.nextLine();
            double sumToSpendOrSave = Double.parseDouble(scan.nextLine());
            days++;

            switch (inputSpendOrSave) {
                case "spend":
                    ownedMoney -= sumToSpendOrSave;
                    if (ownedMoney <= 0) {
                        ownedMoney = 0;
                    }
                    spendDays++;
                    if (spendDays == 5) {
                        isFailed = true;
                        break label;
                    }
                    break;
                case "save":
                    ownedMoney += sumToSpendOrSave;
                    spendDays = 0;
                    break;
            }
        }

        if (isFailed) {
            System.out.printf("You can't save the money.%n" +
                    "%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
