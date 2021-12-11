package PBExams;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int movies = Integer.parseInt(scan.nextLine());
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        double sumRatings = 0.0;
        String maxMovie = "";
        String minMovie = "";
        for (int i = 0; i < movies; i++) {
            String name = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());
            sumRatings += rating;
            if (rating > max) {
                max = rating;
                maxMovie = name;
            }
            if (rating < min) {
                min = rating;
                minMovie = name;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", maxMovie, max);
        System.out.printf("%s is with lowest rating: %.1f%n", minMovie, min);
        System.out.printf("Average rating: %.1f", sumRatings / movies);
    }
}
