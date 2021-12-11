package PBExams;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double totalMoney = 0.0;
        int winersForDay = 0;

        for (int i = 0; i < days; i++) {
            String sport = scan.nextLine();
            double money = 0.0;
            int counterWin = 0;
            int counterLose = 0;
            while (!sport.equals("Finish")) {
                String text = scan.nextLine();
                if (text.equals("win")) {
                    money += 20;
                    counterWin++;
                } else if (text.equals("lose")) {
                    counterLose++;
                }
                sport = scan.nextLine();
            }
            if (counterWin > counterLose) {
                money *= 1.10;
                winersForDay++;
            }
            totalMoney += money;
        }
        int loseDays = days - winersForDay;
        if (winersForDay > loseDays) {
            totalMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
