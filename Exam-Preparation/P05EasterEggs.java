package PBExams;

import java.util.Scanner;

public class P05EasterEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggs = Integer.parseInt(scan.nextLine());
        int redEggs = 0;
        int orangeEggs = 0;
        int greenEggs = 0;
        int blueEggs = 0;
        for (int i = 0; i < eggs; i++) {
            String color = scan.nextLine();
            switch (color) {
                case "red":
                    redEggs++;
                    break;
                case "orange":
                    orangeEggs++;
                    break;
                case "green":
                    greenEggs++;
                    break;
                case "blue":
                    blueEggs++;
                    break;
            }
        }
        int maxEggs = redEggs;
        String maxEggsColor = "red";
        if (orangeEggs > maxEggs) {
            maxEggs = orangeEggs;
            maxEggsColor = "orange";
        }
        if (greenEggs > maxEggs) {
            maxEggs = greenEggs;
            maxEggsColor = "green";
        }
        if (blueEggs > maxEggs) {
            maxEggs = blueEggs;
            maxEggsColor = "blue";
        }
        System.out.printf("Red eggs: %d%n", redEggs);
        System.out.printf("Orange eggs: %d%n", orangeEggs);
        System.out.printf("Blue eggs: %d%n", blueEggs);
        System.out.printf("Green eggs: %d%n", greenEggs);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxEggsColor);
    }
}
