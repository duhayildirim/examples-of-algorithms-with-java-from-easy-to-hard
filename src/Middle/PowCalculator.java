package Middle;

import java.util.Scanner;

public class PowCalculator {
    public static void main(String[] args) {
        int target, pow, result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        target = input.nextInt();
        System.out.print("Enter the pow: ");
        pow = input.nextInt();

        for (int i = 0; i < pow; i++) {
            result *= target;
        }

        System.out.print(target + "**" + pow + "=" + result);
    }
}
