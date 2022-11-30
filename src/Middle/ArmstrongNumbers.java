package Middle;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
//        What is Armstrong Number?
//        An n-digit number is called an Armstrong number if the sum of the nth powers of
//        the digits is equal to the number itself.

        int tempNumber, sum = 0;
        Scanner scan = new Scanner(System.in);
        int pow = 0;

        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        tempNumber = number;

        while (number > 0) {
            number /= 10;
            pow++;
        }
        number = tempNumber;

        while (number > 0) {
            int value = number % 10;
            int tempValue = 1;
            for (int i = 0; i < pow; i++) {
                tempValue *= value;
            }
            sum += tempValue;
            number /= 10;
        }

        if (sum == tempNumber) {
            System.out.print(tempNumber + " is a armstrong number.");
        } else {
            System.out.print(tempNumber + " is a not armstrong number.");
        }
    }
}
