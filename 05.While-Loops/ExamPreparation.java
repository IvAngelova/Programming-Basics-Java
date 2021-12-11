package WhileLoops.exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int poorGrades = Integer.parseInt(scan.nextLine());
        String nameOfProblem = scan.nextLine();
        int sumPoorGrades = 0;
        boolean isFailed = false;
        double sumScore = 0.0;
        int allProblems = 0;
        String lastProblem = "";
        while (!nameOfProblem.equals("Enough")) {
            int score = Integer.parseInt(scan.nextLine());
            sumScore += score;
            allProblems++;
            if (score <= 4) {
                sumPoorGrades++;
                if (sumPoorGrades == poorGrades) {
                    isFailed = true;
                    break;
                }
            }
            lastProblem = nameOfProblem;
            nameOfProblem = scan.nextLine();
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", sumPoorGrades);
        } else {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", sumScore / allProblems, allProblems, lastProblem);
        }

    }

}
