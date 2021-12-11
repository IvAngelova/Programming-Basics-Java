package PBExams;

import java.util.Scanner;

public class P05TheBestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int max = Integer.MIN_VALUE;
        String bestPlayer = "";
        while (!name.equals("END")) {
            int goals = Integer.parseInt(scan.nextLine());
            if (goals > max) {
                max = goals;
                bestPlayer = name;
            }
            if (goals >= 10) {
                break;
            }
            name = scan.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (max >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", max);
        } else {
            System.out.printf("He has scored %d goals.", max);
        }
    }
}
