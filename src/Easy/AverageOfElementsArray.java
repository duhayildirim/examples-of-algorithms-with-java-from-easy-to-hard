package Easy;

public class AverageOfElementsArray {
    public static void main(String[] args) {
        int[] arr = {5, 19, 156, 36, 56, 88};
        double average;
        double count = 0;
        for (int numb : arr) {
            count += numb;
        }
        average = count / arr.length;
        System.out.println("average: " + average);
    }

}
