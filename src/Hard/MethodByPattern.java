package Hard;
import java.util.Scanner;

public class MethodByPattern {
//    Subtract 5 from the entered number up to where the entered number is 0 or negative.
//    Print the last value to the screen during each subtraction. Add 5 again after the number is negative or 0.
//    Again, print the last value of the number on the screen in each addition operation.
    public static void main(String[] args) {
        int number;
        try (var input = new Scanner(System.in)) {
            System.out.println("Enter the numb: ");
            number = input.nextInt();
        }
        patternShow(number, 0, true);
    }

    public static void patternShow(int number, int counter, boolean flag) {
        if (number <= 0)
            flag = false;
        System.out.print(number + " ");

        if (flag) {
            patternShow(number - 5, counter + 1, flag);
        } else {
            if (counter == 0)
                return;
            patternShow(number + 5, counter - 1, flag);
        }
    }
}
