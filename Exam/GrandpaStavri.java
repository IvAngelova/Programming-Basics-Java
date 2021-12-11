package PreExam;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double sumLiters = 0.0;
        double sumDegrees = 0.0;
        for (int i = 0; i < n; i++) {
            double liters = Double.parseDouble(scan.nextLine());
            double degrees = Double.parseDouble(scan.nextLine());
            sumLiters += liters;
            double currentDegree = liters * degrees;
            sumDegrees += currentDegree;
        }
        double midDegree = sumDegrees / sumLiters;
        System.out.printf("Liter: %.2f%n", sumLiters);
        System.out.printf("Degrees: %.2f%n", midDegree);
        if (midDegree < 38) {
            System.out.println("Not good, you should baking!");
        } else if (midDegree <= 42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
