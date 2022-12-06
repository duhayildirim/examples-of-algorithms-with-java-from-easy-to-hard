package Hard;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Guess : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter repeat (0-100) :");
                if (isWrong) {
                    right++;
                    System.out.println("Choose : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Warning");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("It's amazing : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println("Down");
                } else {
                    System.out.println("Up");
                }

                wrong[right++] = selected;
                System.out.println("Choose : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Lose ! ");
            if (!isWrong) {
                System.out.println("Guesses : " + Arrays.toString(wrong));
            }
        }
    }
}
