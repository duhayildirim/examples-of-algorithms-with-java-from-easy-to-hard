package Middle;
import java.util.Scanner;

public class FormingTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines;

        System.out.print("How many lines does the triangle have? ");
        lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= (lines - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
