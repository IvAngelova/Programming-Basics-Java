package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "friday":
                System.out.println(12);
                break;
            case "wednesday":
            case "thursday":
                System.out.println(14);
                break;
            case "saturday":
            case "sunday":
                System.out.println(16);
                break;
        }
    }
}
