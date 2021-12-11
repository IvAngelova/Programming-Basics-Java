package PreExam;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String number = "";
        boolean isFound = false;
        label:
        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        if ((a + b + c + d) == (a * b * c * d) && n % 10 == 5) {
                            number = String.format("%d%d%d%d", a, b, c, d);
                            System.out.println(number);
                            isFound = true;
                            break label;
                        }
                        if ((a * b * c * d) / (a + b + c + d) == 3 && n % 3 == 0) {
                            number = String.format("%d%d%d%d", d, c, b, a);
                            System.out.println(number);
                            isFound = true;
                            break label;
                        }
                    }

                }

            }

        }
        if (!isFound) {
            System.out.println("Nothing found");
        }
    }
}
