package PBExams;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seats = Integer.parseInt(scan.nextLine());
        String text = scan.nextLine();
        int priceTicket = 5;
        int sumPeople = 0;
        int income = 0;
        int totalIncome = 0;
        boolean isFull = false;
        while (!text.equals("Movie time!")) {
            int people = Integer.parseInt(text);
            sumPeople += people;
            if (sumPeople > seats) {
                isFull = true;
                break;
            }
            if (people % 3 == 0) {
                income = (priceTicket * people) - 5;
            } else {
                income = priceTicket * people;
            }
            totalIncome += income;

            text = scan.nextLine();
        }
        if (isFull) {
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %d lv.", totalIncome);
        } else {
            System.out.printf("There are %d seats left in the cinema.%n", seats - sumPeople);
            System.out.printf("Cinema income - %d lv.", totalIncome);
        }
    }
}
