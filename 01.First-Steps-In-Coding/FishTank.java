package FirstStepsInCoding;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthCm = Integer.parseInt(scan.nextLine());
        int widthCm = Integer.parseInt(scan.nextLine());
        int heightCm = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        double volumeInLitres = lengthCm * widthCm * heightCm * 0.001;
        percent = percent * 0.01;
        double result = volumeInLitres * (1 - percent);
        System.out.printf("%.2f", result);
    }
}
