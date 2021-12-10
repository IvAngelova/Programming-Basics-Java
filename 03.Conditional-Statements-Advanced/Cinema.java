package ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        int r = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        switch (projection.toLowerCase()) {
            case "premiere":
                price = r * c * 12.00;
                break;
            case "normal":
                price = r * c * 7.50;
                break;
            case "discount":
                price = r * c * 5.00;
                break;
        }
        System.out.printf("%.2f leva", price);
    }

}
