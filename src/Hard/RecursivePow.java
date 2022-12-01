package Hard;

import java.util.Scanner;

public class RecursivePow {
    static int pow(int n1, int n2) {
        return n2 == 0 ? 1 : n1 * pow(n1, n2 - 1);
    }

    public static void main(String[] args) {
        int n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("n1 : ");
        n1 = input.nextInt();
        System.out.print("n2 : ");
        n2 = input.nextInt();

        System.out.println(pow(n1, n2));
    }
}
