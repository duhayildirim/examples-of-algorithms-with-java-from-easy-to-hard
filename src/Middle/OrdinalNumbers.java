package Middle;

public class OrdinalNumbers {
    public static void main(String[] args) {
//        Write a program that prints prime numbers from 1 to 100 in Java.
        int counter = 0;
        for (int i = 2; i < 100; i++) {
            for (int k = 1; k < i; k++) {
                if (i % k == 0) {
                    counter++;
                }
            }
            if (counter <= 1) {
                System.out.print(i + ", ");
            }
            counter = 0;
        }
    }
}
