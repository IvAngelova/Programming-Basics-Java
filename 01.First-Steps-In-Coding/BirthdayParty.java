package FirstStepsInCoding;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hall = Integer.parseInt(scan.nextLine());

        double cake = hall * 0.20;
        double drinks = cake - cake * 0.45;
        double animator = hall / 3.0;
        double sum = hall + cake + drinks + animator;
        System.out.println(sum);

    }
}
