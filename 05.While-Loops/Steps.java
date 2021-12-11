package WhileLoops.exercise;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goalSteps = 10000;
        int sumSteps = 0;

        while (!(sumSteps >= goalSteps)) {
            String input = scan.nextLine();
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scan.nextLine());
                sumSteps += stepsToHome;
                break;
            }
            int steps = Integer.parseInt(input);
            sumSteps += steps;
        }
        if (sumSteps >= goalSteps) {
            System.out.printf("Goal reached! Good job!%n" +
                    "%d steps over the goal!", sumSteps - goalSteps);
        } else {
            System.out.printf("%d more steps to reach goal.", goalSteps - sumSteps);

        }
    }
}
