package FirstStepsInCoding;

import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int daysForReading = Integer.parseInt(scan.nextLine());

        int timeForReading = pages / pagesPerHour;
        int hoursReadingDay = timeForReading / daysForReading;

        System.out.println(hoursReadingDay);
    }
}
