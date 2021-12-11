package PBExams;

import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int visitors = Integer.parseInt(scan.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        for (int i = 0; i < visitors; i++) {
            String text = scan.nextLine();
            switch (text) {
                case "Back":
                    back++;
                    break;
                case "Chest":
                    chest++;
                    break;
                case "Legs":
                    legs++;
                    break;
                case "Abs":
                    abs++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    break;
                case "Protein bar":
                    proteinBar++;
                    break;
            }
        }
        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", (back + chest + legs + abs) * 1.00 / visitors * 100);
        System.out.printf("%.2f%% - protein%n", (proteinBar + proteinShake) * 1.00 / visitors * 100);

    }
}
