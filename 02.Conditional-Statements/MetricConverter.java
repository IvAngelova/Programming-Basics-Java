package ConditionalStatements.Exercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();

        // Превръщаме input в метри
        if (input.equals("mm")) {
            num = num / 1000;
        } else if (input.equals("cm")) {
            num = num / 100;
        }
        //Конвертиране на input(meters) -> output
        if (output.equals("mm")) {
            num = num * 1000;
        } else if (output.equals("cm")) {
            num = num * 100;
        }
        System.out.printf("%.3f", num);
    }
}
