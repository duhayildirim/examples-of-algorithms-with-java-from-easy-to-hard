package Easy;

import java.util.Scanner;

public class PointAverageCalculator {
    public static void main(String[] args) {
        int math, physics, history, chemical, music, turkish;
        Scanner input = new Scanner(System.in);

        System.out.println("enter the math:");
        math = input.nextInt();

        System.out.println("enter the physics:");
        physics = input.nextInt();

        System.out.println("enter the history:");
        history = input.nextInt();

        System.out.println("enter the chemical:");
        chemical = input.nextInt();

        System.out.println("enter the music:");
        music = input.nextInt();

        System.out.println("enter the turkish:");
        turkish = input.nextInt();

        int count = math + physics + history + chemical + music + turkish;
        double average = count / 6;
        boolean status = average >= 60 ? true : false;
        String text = status == true ? "successful" : "negative";

        System.out.print(text);
    }
}
