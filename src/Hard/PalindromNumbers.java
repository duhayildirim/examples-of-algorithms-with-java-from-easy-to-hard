package Hard;

import java.util.Scanner;

public class PalindromNumbers {
    static boolean palindrom(int x) {
        int temp = x, reverse = 0, last;

        while (temp != 0) {
            last = temp % 10;
            reverse = (reverse * 10) + last;
            temp /= 10;
        }
        if (reverse == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int numb;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numb: ");
        numb = input.nextInt();

        if (!palindrom(numb)) {
            System.out.print("not palindrom");
        } else {
            System.out.print("palindrom");
        }
    }
}
