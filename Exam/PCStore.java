package PreExam;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double processor = Double.parseDouble(scan.nextLine());
        double video = Double.parseDouble(scan.nextLine());
        double ram = Double.parseDouble(scan.nextLine());
        int numberRam = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        double sum = (processor * 1.57 * (1 - percent)) + (video * 1.57 * (1 - percent))
                + ram * numberRam * 1.57;
        System.out.printf("Money needed - %.2f leva.", sum);
    }
}
