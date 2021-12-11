package PreExam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dancers = Integer.parseInt(scan.nextLine());
        double points = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = scan.nextLine();
        double sum = 0.0;
        switch (place) {
            case "Bulgaria":
                sum = dancers * points;
                if (season.equals("summer")) {
                    sum *= 0.95;
                } else if (season.equals("winter")) {
                    sum *= 0.92;
                }
                break;
            case "Abroad":
                sum = (dancers * points) + 0.5 * (dancers * points);
                if (season.equals("summer")) {
                    sum *= 0.9;
                } else if (season.equals("winter")) {
                    sum *= 0.85;
                }
                break;
        }
        double charity = 0.75 * sum;
        double moneyForDancer = (sum - charity) / dancers;
        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", moneyForDancer);
    }
}
