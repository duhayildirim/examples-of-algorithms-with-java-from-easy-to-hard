package Middle;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int target, factorial = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        target = input.nextInt();

        for (int i = 1; i <= target; i++) {
            factorial = factorial * i;
        }
        System.out.println(target+ "! = " + factorial);
    }
}
