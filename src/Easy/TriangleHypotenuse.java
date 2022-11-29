package Easy;
import java.util.Scanner;

public class TriangleHypotenuse {
    public static void main(String[] args) {
        int firstEdge, secondEdge;
        double hypotenuse;
        Scanner input = new Scanner(System.in);

        System.out.println("First edge: ");
        firstEdge = input.nextInt();

        System.out.println("Second edge: ");
        secondEdge = input.nextInt();

        hypotenuse = Math.sqrt(Math.pow(firstEdge, 2) + Math.pow(secondEdge, 2));

        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
