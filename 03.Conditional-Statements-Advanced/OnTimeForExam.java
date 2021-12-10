package ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMin = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMin = Integer.parseInt(scan.nextLine());
        String status = "";
        String output = "";

        int examTime = examHour * 60 + examMin;
        int arrivedTime = arriveHour * 60 + arriveMin;

        if (arrivedTime > examTime) {
            status = "Late";
            int difference = arrivedTime - examTime;
            if (difference < 60) {
                output = String.format("%d minutes after the start", difference);
            } else {
                int hour = difference / 60;
                int min = difference % 60;
                output = String.format("%d:%02d hours after the start", hour, min);
            }
        } else if (arrivedTime < examTime - 30) {
            status = "Early";
            int difference = examTime - arrivedTime;
            if (difference < 60) {
                output = String.format("%d minutes before the start", difference);
            } else {
                int hour = difference / 60;
                int min = difference % 60;
                output = String.format("%d:%02d hours before the start", hour, min);
            }

        } else if (arrivedTime >= examTime - 30 && arrivedTime <= examTime) {
            status = "On time";
            int difference = examTime - arrivedTime;
            if (difference < 60 && difference != 0) {
                output = String.format("%d minutes before the start", difference);
            }
        }
        System.out.println(status);
        System.out.println(output);


    }
}
