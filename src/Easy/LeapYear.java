package Easy;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year:");
        y = input.nextInt();

        if ((y % 400 == 0) || (y % 100 != 0 && y % 4 == 0)) {
            System.out.println(y + "is leap year.");
        } else {
            System.out.println(y + "isn't leap year.");
        }
    }
}
