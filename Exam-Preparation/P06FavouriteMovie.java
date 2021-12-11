package PBExams;

import java.util.Scanner;

public class P06FavouriteMovie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int counter = 0;
        int max = Integer.MIN_VALUE;
        String maxName = "";
        boolean limitIsReached = false;
        while (!name.equals("STOP")) {
            counter++;
            int currentWordSum = 0;
            for (int i = 0; i < name.length(); i++) {
                char letter = name.charAt(i);
                if (Character.isUpperCase(letter)) {
                    letter -= name.length();
                } else if (Character.isLowerCase(letter)) {
                    letter -= 2 * name.length();
                } else {
                    letter = letter;
                }
                currentWordSum += letter;
            }
            if (currentWordSum > max) {
                max = currentWordSum;
                maxName = name;
            }
            if (counter == 7) {
                limitIsReached = true;
                break;
            }
            name = scan.nextLine();
        }
        if (limitIsReached) {
            System.out.println("The limit is reached.");
            System.out.printf("The best movie for you is %s with %d ASCII sum.", maxName, max);
        } else {
            System.out.printf("The best movie for you is %s with %d ASCII sum.", maxName, max);
        }

    }
}
