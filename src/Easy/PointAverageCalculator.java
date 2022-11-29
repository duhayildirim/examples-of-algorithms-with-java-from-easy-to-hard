package Easy;

import java.util.Scanner;

public class PointAverageCalculator {
    public static void main(String[] args) {
        int math, physics, history, chemical, music;
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

        int count = math + physics + history + chemical + music;
        double average = count / 5;
        boolean status = average >= 60 ? true : false;
        String text = status == true ? "successful" : "negative";

        System.out.print(text);
    }
}
