package Hard;

public class RepeatingNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {12, 69, 89, 56, 89, 23, 96, 87, 89, 56, 89, 89};
        int counter = 0;
        int counter2 = 0;
        int target = arr[0];

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                if (arr[x] == arr[y]) {
                    counter++;
                }
            }
            if (counter > counter2) {
                counter2 = counter;
                target = arr[x];
            }
            counter = 0;
        }

        System.out.println(target);
    }
}
