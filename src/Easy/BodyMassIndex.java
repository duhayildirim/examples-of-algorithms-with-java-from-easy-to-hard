package Easy;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double size, kilo, index;

        Scanner input = new Scanner(System.in);

        System.out.println("length: ");
        size = input.nextDouble();

        System.out.println("weight: ");
        kilo = input.nextDouble();

        index = kilo / Math.pow(size, 2);

        System.out.println("Body mass index: " + index);
    }
}
