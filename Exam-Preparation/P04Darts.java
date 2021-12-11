package PBExams;

import java.util.Scanner;

public class P04Darts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String type = scan.nextLine();
        int startPoints = 301;
        int succeeded = 0;
        int notSucceeded = 0;
        boolean isWon = false;
        while (!type.equals("Retire")) {
            int points = Integer.parseInt(scan.nextLine());
            switch (type) {
                case "Single":
                    points = points;
                    break;
                case "Double":
                    points = 2 * points;
                    break;
                case "Triple":
                    points = 3 * points;
                    break;
            }

            if (points <= startPoints) {
                succeeded++;
                startPoints -= points;
                if (startPoints == 0) {
                    isWon = true;
                    break;
                }
            } else {
                notSucceeded++;
                type = scan.nextLine();
                continue;
            }
            type = scan.nextLine();
        }
        if (isWon) {
            System.out.printf("%s won the leg with %d shots.", name, succeeded);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, notSucceeded);
        }
    }
}
