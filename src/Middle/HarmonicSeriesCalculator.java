package Middle;

import java.util.Scanner;

public class HarmonicSeriesCalculator {
    public static void main(String[] args) {
        int target;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        target = input.nextInt();

        for (double i = 1; i <= target; i++) {
            result += (1/i);
        }

        System.out.println(result);
    }
}
