package Middle;

import java.util.Scanner;

public class FindingPowOfFiveAndSix {

    public static void main(String[] args) {
        int target;
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number: ");
        target = input.nextInt();

        for (int i = 5; i < target; i *= 5) {
            System.out.println(i + ",");
        }
        for (int i = 6; i < target; i *= 6) {
            System.out.println(i + ",");
        }
    }
}
