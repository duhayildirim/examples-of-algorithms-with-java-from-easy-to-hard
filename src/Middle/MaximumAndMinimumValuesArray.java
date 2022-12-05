package Middle;

public class MaximumAndMinimumValuesArray {
    public static void main(String[] args) {
        int[] arr = {55, 12, 93, 156, 90, 412, 1, 16};
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("max: " + max + " min: " + min);
    }
}
