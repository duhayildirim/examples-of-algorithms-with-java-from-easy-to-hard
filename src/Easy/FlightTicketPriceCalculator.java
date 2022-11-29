package Easy;

import java.util.Scanner;

public class FlightTicketPriceCalculator {
    public static void main(String[] args) {
// Make the program that calculates the air ticket price according to the distance and conditions with Java. Distance from the User (KM),
// Get the age and type of journey (One Way, Departure - Return). The cost per distance is 0, 10 TL / km forehead.
// First, calculate the total price of the flight, and then according to the conditions, the customer is given the following:
// apply discounts;

// - Values received from the user are valid (distance and age are positive numbers, trip type is 1 or 2) It should be.
//   Otherwise, "You Have Entered Wrong Data!" A warning should be given.
// - If the person is under 12 years old, 50% discount is applied on the ticket price.
// - If the person is between the ages of 12 - 24, 10% discount is applied on the ticket price.
// - If the person is over 65 years old, a 30% discount is applied on the ticket price.
// - If the person has selected the "Journey Type" round trip, 20% discount is applied on the ticket price.

        int km, age, select;
        double price, discountPrice, doublePrice, noDiscount;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Miles: ");
        km = scanner.nextInt();
        price = (km * 0.10);
        System.out.print("1 - one way\n2 - round trip");
        select = scanner.nextInt();

        if (select == 1 && age >= 1 && age <= 100 && km >= 1) {
            if (age < 12) {
                discountPrice = price - ((price * 50) / 100);
                System.out.println(discountPrice);
            } else if (age >= 12 && age <= 24) {
                discountPrice = price - ((price * 10) / 100);
                System.out.println(discountPrice);
            } else if (age >= 65 && age <= 100) {
                discountPrice = price - ((price * 30) / 100);
                System.out.println(discountPrice);
            } else {
                System.out.println(price);
            }
        } else if (select == 2 && age >= 1 && age <= 100 && km >= 1) {
            doublePrice = price * 2;
            if (age < 12) {
                doublePrice = doublePrice - ((doublePrice * 70) / 100);
                System.out.println(doublePrice);
            } else if (age >= 12 && age <= 24) {
                doublePrice = doublePrice - ((doublePrice * 30) / 100);
                System.out.println(doublePrice);
            } else if (age >= 65 && age <= 100) {
                doublePrice = doublePrice - ((doublePrice * 50) / 100);
                System.out.println(doublePrice);
            } else {
                noDiscount = doublePrice - (doublePrice * 20) / 100;
                System.out.println(noDiscount);
            }
        } else {
            System.out.print("Wrong Choose");
        }
    }
}
