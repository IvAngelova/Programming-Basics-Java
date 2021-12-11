
package PBExams;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goalHigh = Integer.parseInt(scan.nextLine());
        int startHigh = goalHigh - 30;
        boolean isFailed = false;
        int jumps = 0;

        while (startHigh <= goalHigh) {
            int notSucceeded = 0;
            if (isFailed) {
                break;
            }
            for (int i = 1; i <= 3; i++) {
                int currentHigh = Integer.parseInt(scan.nextLine());
                jumps++;
                if (currentHigh > startHigh) {
                    startHigh += 5;
                    break;
                } else {
                    notSucceeded++;
                    if (notSucceeded == 3) {
                        isFailed = true;
                        break;
                    }
                }
            }
        }
        if (isFailed) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", startHigh, jumps);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", startHigh - 5, jumps);
        }

    }
}
