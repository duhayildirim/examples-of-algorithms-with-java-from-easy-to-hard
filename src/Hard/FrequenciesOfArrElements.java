package Hard;

public class FrequenciesOfArrElements {
    public static void main(String[] args) {
        int[] arr = {12, 69, 89, 56, 89, 23, 96, 87, 89, 56, 89, 89};
        int counter = 0;

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                if (arr[x] == arr[y]) {
                    counter++;
                }
            }
            System.out.println(arr[x] + "of repetitions: " + counter);
            counter = 0;
        }
    }
}
