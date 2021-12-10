package FirstStepsInCoding;

import java.util.Scanner;

public class GreenMaking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double qm = Double.parseDouble(scan.nextLine());
        double price = qm * 7.61;
        double discount = price * 0.18;
        double EndPrice = price - discount;
        System.out.println("The final price is: " + EndPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
