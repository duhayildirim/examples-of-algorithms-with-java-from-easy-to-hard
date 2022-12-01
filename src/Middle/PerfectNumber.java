package Middle;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
//        A number whose positive integer factors (divisors without a remainder) are equal to itself, excluding
//        the number itself, is called a perfect number.
        int target, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        target = input.nextInt();
        for (int i = 1; i < target; i++) {
            if (target % i == 0) {
                sum += i;
            }
        }
        if (target == sum) {
            System.out.print("It's perfect number");
        } else {
            System.out.println("It's not perfect number");
        }
    }
}
