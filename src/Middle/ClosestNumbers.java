package Middle;

import java.util.Scanner;

public class ClosestNumbers {
    //    Write a program that finds the smallest number of elements in the array,
    //    and the closest number, and the closest number.
    public static void main(String[] args) {
        int[] arr = {55, 12, 93, 156, 90, 412, 1, 16};
        int diff = 100, oldDiff, sum, oldSum = 100, target1 = 0, target2 = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numb: ");
        int numb = input.nextInt();

        for (int i : arr) {
            if (i < numb) {
                oldDiff = numb - i;
                if (oldDiff < diff) {
                    diff = oldDiff;
                    target1 = i;
                }
            }
            if (i > numb) {
                sum = numb + i;
                if (sum < oldSum) {
                    oldSum = sum;
                    target2 = i;
                }
            }
        }
        System.out.println(target1 + " and " + target2);

    }
}
