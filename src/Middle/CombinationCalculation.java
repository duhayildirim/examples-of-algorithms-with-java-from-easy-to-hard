package Middle;

import java.util.Scanner;

public class CombinationCalculation {
    public static void main(String[] args) {
        int n, r, n_factorial = 1, r_factorial = 1, n_r_factorial = 1, result;
        Scanner input = new Scanner(System.in);

        System.out.print("n: ");
        n = input.nextInt();

        System.out.print("r: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            n_factorial = n_factorial * i;
        }

        for (int i = 1; i <= r; i++) {
            r_factorial = r_factorial * i;
        }

        for (int i = 1; i <= n - r; i++) {
            n_r_factorial = n_r_factorial * i;
        }

        result = r_factorial * n_r_factorial;
        result = n_factorial / result;

        System.out.println("C("+ n + ","+ r + ") = " + result);

    }
}
