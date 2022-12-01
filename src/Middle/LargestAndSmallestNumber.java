package Middle;

import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
//        Write a program that finds the largest and smallest numbers from N counting numbers entered from the keyboard
//        in Java and writes these numbers to the screen.
        int target, tempInput, largest = 0, smallest = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        target = input.nextInt();

        for (int i = 1; i <= target; i++) {
            System.out.print(i + ". =");
            tempInput = input.nextInt();
            if (largest < tempInput) {
                largest = tempInput;
            }
            if (smallest > tempInput) {
                smallest = tempInput;
            }
        }

        System.out.println("Small: " + smallest);
        System.out.println("Big: " + largest);
    }
}
