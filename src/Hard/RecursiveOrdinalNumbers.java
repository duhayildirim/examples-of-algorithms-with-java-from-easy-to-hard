package Hard;

import java.util.Scanner;

public class RecursiveOrdinalNumbers {
    static void asal(int numb, int i) {
        if (i == numb) {
            System.out.println("ordinal");
            return;
        } else if (numb % i == 0) {
            System.out.println("not ordinal");
            return;
        }
        asal(numb, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numb:  ");
        int numb = input.nextInt();
        asal(numb, 2);
        input.close();
    }
}
