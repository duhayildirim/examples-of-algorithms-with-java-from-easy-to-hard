package Easy;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2, result;
        int choise;

        Scanner input = new Scanner(System.in);

        System.out.println("enter to first number:");
        num1 = input.nextDouble();
        System.out.println("choose operator: \n + = 1\n - = 2 \n * = 3 \n / = 4");
        choise = input.nextInt();
        System.out.println("enter to first number:");
        num2 = input.nextDouble();

        if(choise == 1 || choise == 2 || choise == 3 || choise == 4) {
            if (choise == 1) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (choise == 2) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (choise == 3) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            } else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        } else {
            System.out.println("Wrong operator.");
        }
    }
}
