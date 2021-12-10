package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income = Double.parseDouble(scan.nextLine());
        double avgScore = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());

        double socialScholarship = 0.0;
        double excellentScholarship = 0.0;
        String output = "";
        boolean isApproved = false;

        if (income < minSalary && avgScore > 4.50) {
            socialScholarship = Math.floor(minSalary * 0.35);
            isApproved = true;
        }
        if (avgScore >= 5.50) {
            excellentScholarship = Math.floor(avgScore * 25);
            isApproved = true;
        }
        if (socialScholarship > excellentScholarship) {
            output = String.format("You get a Social scholarship %.0f BGN", socialScholarship);
        } else {
            output = String.format("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        }
        if (!isApproved) {
            output = "You cannot get a scholarship!";
        }

        System.out.println(output);
    }
}
