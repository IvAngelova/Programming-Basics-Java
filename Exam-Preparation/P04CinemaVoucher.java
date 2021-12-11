package PBExams;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int voucher = Integer.parseInt(scan.nextLine());
        String text = scan.nextLine();
        int movies = 0;
        int products = 0;
        while (!text.equals("End")) {
            int length = text.length();
            int price = 0;
            if (length <= 8) {
                price = text.charAt(0);
            } else {
                price = text.charAt(0) + text.charAt(1);
            }
            if (price > voucher) {
                break;
            } else {
                voucher -= price;
                if (length > 8) {
                    movies++;
                } else {
                    products++;
                }
            }

            text = scan.nextLine();
        }
        System.out.printf("%d%n%d", movies, products);
    }
}
