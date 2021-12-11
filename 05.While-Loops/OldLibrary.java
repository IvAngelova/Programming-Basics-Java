package WhileLoops.exercise;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String searchedBook = scan.nextLine();
        String input = scan.nextLine();
        int checkedBooks = 0;
        boolean isFound = false;
        while (!input.equals("No More Books")) {
            if (input.equals(searchedBook)) {
                isFound = true;
                break;
            }
            checkedBooks++;
            input = scan.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", checkedBooks);
        } else {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.\n", checkedBooks);
        }

    }

}
