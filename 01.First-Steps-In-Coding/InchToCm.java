package FirstStepsInCoding;

import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double sm = a * 2.54;
        System.out.println(sm);

    }
}
