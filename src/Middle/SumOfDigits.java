package Middle;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Program to calculate the sum of digits of a number
        Scanner input = new Scanner(System.in);
        int target, tempTarget, sumDigits = 0;

        System.out.print("Enter the number: ");
        target = input.nextInt();

        tempTarget = target;
        while (tempTarget > 0) {
            int temp = tempTarget % 10;
            sumDigits += temp;
            tempTarget /= 10;
        }

        System.out.println(sumDigits);
    }
}
