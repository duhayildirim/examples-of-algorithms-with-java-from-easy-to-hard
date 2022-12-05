package Hard;

public class RepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {12, 69, 89, 56, 89, 23, 96, 87, 89, 56, 89, 89};

        for (int i : arr) {
            if (i % 2 == 0) {
                for (int j : arr) {
                    if (i == j) {
                        System.out.println(i);
                    }
                }
            }
        }


    }
}
