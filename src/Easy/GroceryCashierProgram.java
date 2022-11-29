package Easy;

import java.util.Scanner;

public class GroceryCashierProgram {
    public static void main(String[] args) {
//        The program that prints the total amount of the products bought by the users
//        from the grocery store, according to the kilogram values, on the screen.

        double pear = 2.14 , apple = 3.67 , tomatoes = 1.11 , banana = 0.95 , aubergine = 5.00, total;
        Scanner input = new Scanner(System.in);

        System.out.println("Pear piece: ");
        pear = pear * input.nextDouble();
        System.out.println("Apple piece: ");
        apple = apple * input.nextDouble();
        System.out.println("Tomatoes piece: ");
        tomatoes = tomatoes * input.nextDouble();
        System.out.println("Banana piece: ");
        banana = banana * input.nextDouble();
        System.out.println("Aubergine piece: ");
        aubergine = aubergine * input.nextDouble();

        total = pear + apple + tomatoes + banana + aubergine;
        System.out.println("Total price: " + total);
    }
}
