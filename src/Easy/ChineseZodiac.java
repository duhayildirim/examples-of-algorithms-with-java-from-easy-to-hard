package Easy;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birthday: ");
        double age = scanner.nextDouble();
        double result = (age % 12);

        if (result == 0) {
            System.out.println("Monkey");
        } else if (result == 1) {
            System.out.println("Rooster");
        } else if (result == 2) {
            System.out.println("Dog");
        } else if (result == 3) {
            System.out.println("Pig");
        } else if (result == 4) {
            System.out.println("Mice");
        } else if (result == 5) {
            System.out.println("Ox");
        } else if (result == 6) {
            System.out.println("Tiger");
        } else if (result == 7) {
            System.out.println("Rabbit");
        } else if (result == 8) {
            System.out.println("Dragon");
        } else if (result == 9) {
            System.out.println("Snake");
        } else if (result == 10) {
            System.out.println("Horse");
        } else if (result == 11) {
            System.out.println("Sheep");
        } else {
            System.out.println("birthday failed. Try again");
        }
    }
}
