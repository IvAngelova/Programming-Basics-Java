package PBExams;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int max = Integer.MIN_VALUE;
        String nameWinner = "";
        while (!input.equals("Stop")) {
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                int number = Integer.parseInt(scan.nextLine());
                char letter = input.charAt(i);
                if (letter == number) {
                    sum += 10;
                } else {
                    sum += 2;
                }
            }
            if (sum >= max) {
                max = sum;
                nameWinner = input;
            }
            input = scan.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", nameWinner, max);
    }
}
