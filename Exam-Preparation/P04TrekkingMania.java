package PBExams;

import java.util.Scanner;

public class P04TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groups = Integer.parseInt(scan.nextLine());
        double totalPeople = 0.0;
        double musalaGroup = 0.0;
        double monblanGroup = 0.0;
        double kilimandjaroGroup = 0.0;
        double k2Group = 0.0;
        double everestGroup = 0.0;
        for (int i = 0; i < groups; i++) {
            int peopleInGroup = Integer.parseInt(scan.nextLine());
            totalPeople += peopleInGroup;
            if (peopleInGroup <= 5) {
                musalaGroup += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblanGroup += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandjaroGroup += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2Group += peopleInGroup;
            } else {
                everestGroup += peopleInGroup;
            }
        }
        System.out.printf("%.2f%%%n", (musalaGroup / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (monblanGroup / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (kilimandjaroGroup / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (k2Group / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (everestGroup / totalPeople) * 100);
    }
}
