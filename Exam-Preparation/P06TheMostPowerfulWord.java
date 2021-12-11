package PBExams;

import java.util.Scanner;

public class P06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String mostPowerfulWordText = "";
        double mostPowerfulWord = Double.NEGATIVE_INFINITY;
        while (!text.equals("End of words")) {
            double sum = 0;
            boolean vowelFound = false;
            for (int i = 0; i < text.length(); i++) {
                char letter = text.charAt(i);
                sum += letter;
                char letterIgnoreCase = Character.toLowerCase(letter);
                if (i == 0) {
                    switch (letterIgnoreCase) {
                        case 'a':
                        case 'o':
                        case 'u':
                        case 'e':
                        case 'i':
                        case 'y':
                            vowelFound = true;
                            break;
                    }
                }
            }
            if (vowelFound) {
                sum *= text.length();
            } else {
                sum = Math.floor(sum / text.length());
            }
            if (sum > mostPowerfulWord) {
                mostPowerfulWord = sum;
                mostPowerfulWordText = text;
            }

            text = scan.nextLine();
        }

        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWordText, mostPowerfulWord);
    }
}
