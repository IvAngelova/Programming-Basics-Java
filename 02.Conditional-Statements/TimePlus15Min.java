package ConditionalStatements.Exercise;

import java.util.Scanner;

public class TimePlus15Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputHours = Integer.parseInt(scan.nextLine());
        int inputMinutes = Integer.parseInt(scan.nextLine());
        int totalMin = inputHours * 60 + inputMinutes + 15;
        int hours = totalMin / 60;
        int min = totalMin % 60;

        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, min);
    }
}
