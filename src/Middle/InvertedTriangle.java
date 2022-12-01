package Middle;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);
        System.out.print("Lines : ");
        line = input.nextInt();

        for (int i = line; i >= 1; i--) {
            for(int k = i; k < line; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
