package Middle;

import java.util.Scanner;

public class SumEvenAndMultipleOfFour {
    public static void main(String[] args) {
        int sum = 0, target = 0, i = 0;
        Scanner input = new Scanner(System.in);

        while (target % 2 == 0) {
            System.out.println("Enter the number");
            target = input.nextInt();
            if (target % 2 == 0 && target % 4 == 0) {
                sum += target;
            }
        }
        System.out.println(sum);
    }
}
