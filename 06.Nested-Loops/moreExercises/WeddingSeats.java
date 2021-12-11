package NestedLoops.moreExercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lastSector = scan.nextLine();
        int rowsInA = Integer.parseInt(scan.nextLine());
        int seatsInOddRow = Integer.parseInt(scan.nextLine());
        char symbolLastSector = lastSector.charAt(0);
        int seats = 0;
        int counter = 0;
        for (char i = 65; i <= symbolLastSector; i++) {
            if (i > 65) {
                rowsInA++;
            }
            for (int j = 1; j <= rowsInA; j++) {
                if (j % 2 == 0) {
                    seats = 2 + seatsInOddRow;
                } else {
                    seats = seatsInOddRow;
                }
                for (int k = 97; k < 97 + seats; k++) {
                    counter++;
                    System.out.printf("%c%d%c%n", i, j, k);

                }

            }

        }
        System.out.println(counter);
    }
}
