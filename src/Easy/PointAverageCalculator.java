package Easy;

import java.util.Scanner;

public class PointAverageCalculator {
    public static void main(String[] args) {
        int math, physics, chemical, turkish, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter math:");
        math = input.nextInt();
        if (math < 0 || math > 100) {
            math = 0;
        }
        System.out.print("Enter physics:");
        physics = input.nextInt();
        if (physics < 0 || physics > 100) {
            physics = 0;
        }
        System.out.print("Enter chemical:");
        chemical = input.nextInt();
        if (chemical < 0 || chemical > 100) {
            chemical = 0;
        }
        System.out.print("Enter turkish:");
        turkish = input.nextInt();
        if (turkish < 0 || turkish > 100) {
            turkish = 0;
        }
        System.out.print("Enter music:");
        music = input.nextInt();
        if (music < 0 || music > 100) {
            music = 0;
        }

        double average = (math + physics + chemical + turkish + music) / 5;


        if (average <= 55) {
            System.out.println("negative");
        } else {
            System.out.println("succesfull.");
        }
        System.out.println("average : " + average);
    }
}
