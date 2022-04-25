package v60;

import java.util.Arrays;

public class MatrixMain {

    public static void main(String[] args) {
//        simpleMatrix();
        irregularMatrix();
    }

    private static void simpleMatrix() {
        // Kétdimenziós tömb - mátrix
        // Egy többdimenziós tömb = tömbök tömbje
        // int[4][3] = [int[3], int[3], int[3], int[3]]
        int[][] numbers = new int[4][3];

        numbers[0][0] = 4; // értékadás

        numbers[1][0] = numbers[0][0] * 2; // hivatkozás egy elemre
        int thirdInFirstRow = numbers[0][2];
        System.out.println("numbers[1][2] = " + numbers[1][2] + "\n");
        printMatrix(numbers);
        //System.out.println(Arrays.toString(numbers));
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != null) {
                System.out.print("[");
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(matrix[i][j]);
                }
                System.out.println("]");
            } else {
                System.out.println("null");
            }
        }
    }

    private static void irregularMatrix() {
        // Egy többdimenziós tömb = tömbök tömbje
        // int[4][] = [null, null, null, null]
        int[][] numbers = new int[4][];
        int[][] others = new int[][] {
                {4, 0, 0},
                {8, 0, 0},
                {0, 0, 5},
                null
        };

        numbers[0] = new int[3]; // int[4][] = [int[3], null, null, null]
        numbers[0][0] = 4; // értékadás

        numbers[1] = new int[2]; // int[4][] = [int[3], int[2], null, null]
        numbers[1][0] = numbers[0][0] * 2; // hivatkozás egy elemre
        int thirdInFirstRow = numbers[0][2];

        numbers[2] = new int[5]; // int[4][] = [int[3], int[2], int[5], null]
        numbers[2][2] = 5;
        System.out.println("numbers[2][2] = " + numbers[2][2] + "\n");
        printMatrix(numbers);
    }

}
