package PBExams;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int clients = Integer.parseInt(scan.nextLine());
        double totalSum = 0;
        for (int i = 0; i < clients; i++) {
            String item = scan.nextLine();
            double price = 0;
            double currentSum = 0;
            int counter = 0;
            while (!item.equals("Finish")) {
                switch (item.toLowerCase()) {
                    case "basket":
                        price = 1.50;
                        break;
                    case "wreath":
                        price = 3.80;
                        break;
                    case "chocolate bunny":
                        price = 7.0;
                        break;
                }
                counter++;
                currentSum += price;
                item = scan.nextLine();
            }
            if (counter % 2 == 0) {
                currentSum *= 0.8;
            }
            totalSum += currentSum;
            System.out.printf("You purchased %d items for %.2f leva.%n", counter, currentSum);
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalSum / clients);
    }
}
