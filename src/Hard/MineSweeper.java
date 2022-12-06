package Hard;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    //    Game rules :
//    The game is text based.
//    It should be played on two-dimensional arrays and designed within the MineSweeper class.
//    The matrix size, that is, the number of rows and columns, should be determined by the user.
//    A quarter of the number of elements of the array (number of elements / 4) should be randomly placed.
//    For example the array is 4x3
//    the number of elements must be calculated with the formula (Number of Rows * Number of Columns) and its size must be 12.
//    In this case, the number of mines
//    There should be 12 / 4 = 3 pieces. (hint: you can create a second array to hold the positions of these mines.)
//    The user must select a point on the matrix. For point selection, row and column values must be entered.
//    It should be checked whether the selected point is within the boundaries of the array and if the condition is not met,
//    the point should be requested again.
//    If there is a mine at the point where the user enters, he must lose the game.
//    If there is no mine, all positions that touch the relevant point should be looked at
//            (right, left, up, down, upper left diagonal,
//             upper right diagonal, lower right diagonal, lower left diagonal)
//    and the sum of the number of mines around it should be written on the relevant point.
//    If there is no mine touching the point, the value "0" should be assigned.
//    If the user can select all the points without pressing any mines, he should win the game.
    int rowNumber;
    int colNumber;
    int mineNumber;
    String[][] fieldVisible;
    String[][] fieldHidden;

    public static void main(String[] args) {
        int row, col;
        try (var input = new Scanner(System.in)) {
            System.out.println("Row for game map: ");
            row = input.nextInt();
            System.out.println("Col for game map: ");
            col = input.nextInt();
            MineSweeper mine = new MineSweeper(row, col);
            mine.run();
        }
    }

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.fieldVisible = new String[rowNumber][colNumber];
        this.fieldHidden = new String[rowNumber][colNumber];
        this.mineNumber = (rowNumber * colNumber) / 4;
    }

    public void setFields() {
        Random rnd = new Random();
        int randRow;
        int randCol;
        for (int i = 0; i < mineNumber; i++) {
            randRow = rnd.nextInt(rowNumber);
            randCol = rnd.nextInt(colNumber);
            if (!Objects.equals(fieldHidden[randRow][randCol], "*")) {
                fieldHidden[randRow][randCol] = "*";
            } else {
                i--;
            }
        }
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                fieldVisible[i][j] = "-";
                if (!Objects.equals(fieldHidden[i][j], "*")) {
                    fieldHidden[i][j] = "-";
                }
            }
        }
    }

    void getVisibleField() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(fieldVisible[i][j] + " ");
            }
            System.out.println();
        }
    }

    void getHiddenField() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(fieldHidden[i][j] + " ");
            }
            System.out.println();
        }
    }

    void run() {
        Scanner input = new Scanner(System.in);
        int row, col, totalMove = rowNumber * colNumber - mineNumber;
        setFields();
        System.out.println("Let's go");
        while (totalMove > 0) {
            System.out.print("Enter the row: ");
            row = input.nextInt();
            System.out.print("Enter the column: ");
            col = input.nextInt();

            if ((row < 0 || row >= rowNumber) || (col < 0 || col >= colNumber)) {
                System.out.println("Wrong choose");
                continue;
            }
            if (Objects.equals(fieldHidden[row][col], "*")) {
                System.out.println("Lose");
                getHiddenField();
                break;
            } else {
                if (!Objects.equals(fieldVisible[row][col], "-")) {
                    System.out.println("Wrong choose");
                } else {
                    int counter = 0;
                    if (!Objects.equals(fieldHidden[row][col], "*")) {
                        if (row != 0) {
                            if (Objects.equals(fieldHidden[row - 1][col], "*")) counter++;
                            if (col != 0)
                                if (Objects.equals(fieldHidden[row - 1][col - 1], "*")) counter++;

                        }
                        if (row != rowNumber - 1) {
                            if (Objects.equals(fieldHidden[row + 1][col], "*")) counter++;
                            if (col != colNumber - 1)
                                if (Objects.equals(fieldHidden[row + 1][col + 1], "*")) counter++;

                        }
                        if (col != 0) {
                            if (Objects.equals(fieldHidden[row][col - 1], "*")) counter++;
                            if (row != rowNumber - 1)
                                if (Objects.equals(fieldHidden[row + 1][col - 1], "*")) counter++;

                        }
                        if (col != colNumber - 1) {
                            if (Objects.equals(fieldHidden[row][col + 1], "*")) counter++;
                            if (row != 0)
                                if (Objects.equals(fieldHidden[row - 1][col + 1], "*")) counter++;

                        }

                        fieldVisible[row][col] = Integer.toString(counter);
                    }
                }
            }
            totalMove--;
            getVisibleField();
        }
        if (totalMove == 0) {
            System.out.println("WIN");
        }
        input.close();
    }
}
