package Easy;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskAmountCalculator {
    public static void main(String[] args) {
        double taxRatio, purPrice;

        Scanner input = new Scanner(System.in);

        System.out.println("Pure price: ");
        purPrice = input.nextDouble();

        System.out.println("Tax ratio: ");
        taxRatio = input.nextDouble();

        double tax = taxRatio * purPrice;
        double price = purPrice + tax;

        System.out.println("taxed price: " + price);
    }
}
