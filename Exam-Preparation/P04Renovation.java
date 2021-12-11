package PBExams;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());
        int totalArea = height * width * 4;
        int areaToPaint = (int) Math.ceil(totalArea * (1 - percent * 1.0 / 100));
        String input = scan.nextLine();
        while (!input.equals("Tired!")) {
            int litresPaint = Integer.parseInt(input);
            areaToPaint -= litresPaint;
            if (areaToPaint <= 0) {
                break;
            }
            input = scan.nextLine();
        }
        if (areaToPaint == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else if (areaToPaint < 0) {
            System.out.printf("All walls are painted and you have %d l paint left!", Math.abs(areaToPaint));
        } else {
            System.out.printf("%d quadratic m left.", areaToPaint);
        }
    }
}
