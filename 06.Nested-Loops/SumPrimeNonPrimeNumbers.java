package NestedLoops.exercise;

import java.util.Scanner;

public class SumPrimeNonPrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sumNonPrime = 0;
        int sumPrime = 0;
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isNonPrime = false;
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scan.nextLine();
                continue;
            }
            // Проверка дали числото е просто или непросто
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isNonPrime = true;
                    break;
                }
            }
            if (isNonPrime) {
                sumNonPrime += number;
            } else {
                sumPrime += number;
            }
            input = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);

    }
}
