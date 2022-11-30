package Middle;

import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        int target;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive number:");
        target = input.nextInt();

        if (target > 0) {
            for (int i = 0; i < target; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + ",");
                }
            }
        } else {
            System.out.println("Wrong choose");
        }

    }
}
