package WhileLoops.lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        int volume = w * l * h;
        boolean isAnyVolumeLeft = true;
        int sumOfBoxes = 0;
        String input = scan.nextLine();
        while (!(input.equals("Done"))) {
            int boxes = Integer.parseInt(input);
            sumOfBoxes += boxes;
            if (sumOfBoxes > volume) {
                isAnyVolumeLeft = false;
                break;
            }
            input = scan.nextLine();
        }
        int diff = Math.abs(sumOfBoxes - volume);
        if (isAnyVolumeLeft) {
            System.out.printf("%d Cubic meters left.", diff);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        }


    }
}
