package WhileLoops.lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int cls = 1;
        int fails = 0;
        double totalGrade = 0.0;
        boolean isFailedMoreThanOnce = false;
        while (cls <= 12) {
            double currentGrade = Double.parseDouble(scan.nextLine());
            if (currentGrade >= 4.00) {
                cls++;
                totalGrade += currentGrade;
                continue;
            }
            totalGrade += currentGrade;
            fails++;
            if (fails > 1) {
                isFailedMoreThanOnce = true;
                break;
            }
        }
        if (isFailedMoreThanOnce) {
            System.out.printf("%s has been excluded at %d grade", name, cls);
        } else {
            double averageGrade = totalGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);

        }
    }
}
