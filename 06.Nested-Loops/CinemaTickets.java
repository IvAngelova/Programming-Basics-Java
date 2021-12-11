package NestedLoops.lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        int standardTickets = 0;
        int kidsTickets = 0;
        int studentTickets = 0;
        int allTickets = 0;   // totalTickets
        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scan.nextLine());
            String text = scan.nextLine();
            int currentMovieTickets = 0;
            while (!text.equals("End")) {
                allTickets++;
                switch (text) {
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidsTickets++;
                        break;
                    case "student":
                        studentTickets++;
                        break;
                }
                currentMovieTickets++;
                if (currentMovieTickets >= freeSeats) {
                    break;
                }
                text = scan.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, currentMovieTickets * 1.0 / freeSeats * 100);
            movieName = scan.nextLine();
        }
        double studentPercentage = studentTickets * 1.0 / allTickets * 100;
        double standardPercentage = standardTickets * 1.0 / allTickets * 100;
        double kidsPercentage = kidsTickets * 1.0 / allTickets * 100;
        System.out.printf("Total tickets: %d\n" +
                "%.2f%% student tickets.\n" +
                "%.2f%% standard tickets.\n" +
                "%.2f%% kids tickets.\n", allTickets, studentPercentage, standardPercentage, kidsPercentage);
    }
}
