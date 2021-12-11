package PBExams;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double recordSec = Double.parseDouble(scan.nextLine());
        double distanceMet = Double.parseDouble(scan.nextLine());
        double timeSec = Double.parseDouble(scan.nextLine());

        double mustRunSek = distanceMet * timeSec;
        double resistance = Math.floor(distanceMet / 50) * 30;
        double mustRunTotal = mustRunSek + resistance;
        if (mustRunTotal < recordSec) {
            System.out.printf("Yes! The new record is %.2f seconds.", mustRunTotal);
        } else if (mustRunTotal >= recordSec) {
            System.out.printf("No! He was %.2f seconds slower.", mustRunTotal - recordSec);
        }

    }
}
