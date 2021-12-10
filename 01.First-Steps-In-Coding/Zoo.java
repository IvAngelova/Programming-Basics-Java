package FirstStepsInCoding;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int animals = Integer.parseInt(scan.nextLine());
        double sum1 = dogs * 2.50;
        double sum2 = animals * 4;
        double EndSum = sum1 + sum2;
        System.out.println(EndSum + " lv.");

    }
}
