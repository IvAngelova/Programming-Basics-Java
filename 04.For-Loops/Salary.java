package ForLoops.exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        String output = "";
        for (int i = 0; i < tabs; i++) {
            String webSite = scan.nextLine();
            switch (webSite.toLowerCase()) {
                case "facebook":
                    salary -= 150;
                    break;
                case "instagram":
                    salary -= 100;
                    break;
                case "reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                break;
            }
        }
        if (salary <= 0) {
            output = "You have lost your salary.";
        } else {
            output = String.format("%d", salary);
        }
        System.out.println(output);

    }
}

