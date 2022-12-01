package Middle;

import java.util.Scanner;

public class FormingDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= (n - (n - i)); k++) {
                System.out.print(" ");
            }
            for (int j = (((2 * n) - 3) - ((2 * i) - 1)); j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//               1
//              222
//             33333
//              222
//               1
}
