package Middle;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int target, a = 0, b = 1, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numb: ");
        target = input.nextInt();

        System.out.print("0 1 ");
        for (int i = 0; i < target - 2; i++) {
            result = a + b;
            a = b;
            b = result;
            System.out.print(result + " ");
        }
    }
}
