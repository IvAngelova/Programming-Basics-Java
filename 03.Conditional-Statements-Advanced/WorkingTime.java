package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class WorkingTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
        if (hour >= 10 && hour <= 18) {
            switch (day.toLowerCase()) {
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                case "friday":
                case "saturday":
                    System.out.println("open");
                    break;
                case "sunday":
                    System.out.println("closed");
                    break;
            }
        } else {
            System.out.println("closed");
        }
    }
}
