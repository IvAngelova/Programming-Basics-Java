package NestedLoops.exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine()); // членове жури
        String input = scan.nextLine();
        int allPresentations = 0;
        double sumAllAvgGrades = 0.0;
        while (!input.equals("Finish")) {
            String presentation = input;
            allPresentations++;
            double sumGradesCurrentPresentation = 0.0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                sumGradesCurrentPresentation += grade;
            }
            double avgGradeCurrentPresentation = sumGradesCurrentPresentation / n;
            System.out.printf("%s - %.2f.%n", presentation, avgGradeCurrentPresentation);
            sumAllAvgGrades += avgGradeCurrentPresentation;
            input = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumAllAvgGrades / allPresentations);
    }
}
