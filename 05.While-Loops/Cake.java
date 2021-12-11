package WhileLoops.exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int allCakePieces = length * width;
        boolean isEaten = false;
        String input = scan.nextLine();
        while (!input.equals("STOP")) {
            int cakePiecesToken = Integer.parseInt(input);
            allCakePieces -= cakePiecesToken;
            if (allCakePieces < 0) {
                isEaten = true;
                break;
            }
            input = scan.nextLine();
        }
        if (isEaten) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allCakePieces));
        } else {
            System.out.printf("%d pieces are left.", allCakePieces);

        }
    }
}
