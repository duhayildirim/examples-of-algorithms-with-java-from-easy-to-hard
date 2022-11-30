package Easy;

import java.util.Scanner;

public class CircleAreaCircumference {
    public static void main(String[] args) {
        double area, circumference, PI = 3.14;
        int r;

        System.out.print("Enter the radius: ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();

        area = PI * Math.pow(r, 2);
        circumference = 2 * PI * r;

        System.out.println("circumference: " + circumference);
        System.out.print("area: " + area);
    }
}
