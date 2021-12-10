package ConditionalStatements.Exercise;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double recordSec = Double.parseDouble(scan.nextLine());
        double distanceMet = Double.parseDouble(scan.nextLine());
        double timeSec = Double.parseDouble(scan.nextLine());

        double mustSwimSek = distanceMet * timeSec;
        double resistance = Math.floor(distanceMet / 15) * 12.5;
        double mustSwimTotal = mustSwimSek + resistance;
        if (mustSwimTotal < recordSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", mustSwimTotal);
        } else if (mustSwimTotal >= recordSec) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", mustSwimTotal - recordSec);
        }


    }
}
