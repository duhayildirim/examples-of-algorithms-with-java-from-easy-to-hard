package Hard;

public class HarmonicAverage {
    public static void main(String[] args) {
        //Harmonic Mean formula: n (number of elements) / harmonic series of elements
        int[] arr = {55, 12, 93, 156, 90, 412, 1, 16};
        double series = 0, harmonic;
        for (double i : arr) {
            series += 1 / i;
        }
        harmonic = arr.length / series;
        System.out.println("Harmonic Mean: " + harmonic);
    }
}
