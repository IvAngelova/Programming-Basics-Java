package PBExams;

import java.util.Scanner;

public class P05Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double startPoints = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        double rating = startPoints;
        boolean isNominated = false;
        for (int i = 0; i < n; i++) {
            String nameJury = scan.nextLine();
            double points = Double.parseDouble(scan.nextLine());
            double currentRating = (nameJury.length() * points) / 2;
            rating += currentRating;
            if (rating > 1250.5) {
                isNominated = true;
                break;
            }
        }
        if (isNominated) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, rating);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - rating);
        }
    }
}
