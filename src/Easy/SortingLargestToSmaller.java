package Easy;

import java.util.Scanner;

public class SortingLargestToSmaller {
    public static void main(String[] args) {
        int first, second, third;

        Scanner input = new Scanner(System.in);

        System.out.print("first number:");
        first = input.nextInt();

        System.out.print("second number:");
        second = input.nextInt();

        System.out.print("third number:");
        third = input.nextInt();

        if ((first < second) && (first < third)) {
            if (second < third) {
                System.out.println(first + " < " + second + " < " + third);
            } else {
                System.out.println(first + " < " + third + " < " + second);
            }
        } else if ((second < first) && (second < first)) {
            if (first < third) {
                System.out.println(second + " < " + first + " < " + third);
            } else {
                System.out.println(second + " < " + third + " < " + first);
            }
        } else if ((third < first) && (third < second)) {
            if (first < second) {
                System.out.println(third + " < " + first + " < " + second);
            } else {
                System.out.println(third + " < " + second + " < " + first);
            }
        }

    }
}
