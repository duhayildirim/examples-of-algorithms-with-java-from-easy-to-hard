package Easy;

import java.util.Scanner;

public class TaxiPriceCalculator {
    public static void main(String[] args) {
        int miles;
        double priceOfMile, total;

        Scanner input = new Scanner(System.in);
        System.out.print("enter the total miles: ");
        miles = input.nextInt();

        System.out.print("price of mile: ");
        priceOfMile = input.nextDouble();

        total = miles * priceOfMile;
        total += 10;

        total = (total < 20) ? total = 20 : total;

        System.out.print("Total price: " + total);
    }
}
