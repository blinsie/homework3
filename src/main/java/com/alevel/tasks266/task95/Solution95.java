package com.alevel.tasks266.task95;

/**
 * Получить матрицу:
 *
 *      1 2 3 4 5 6 7 8 9 10
 *      0 1 2 3 4 5 6 7 8 9
 *      0 0 1 2 3 4 5 6 7 8
 *      0 0 0 1 2 3 4 5 6 7
 *      0 0 0 0 1 2 3 4 5 6
 *      0 0 0 0 0 1 2 3 4 5
 *      0 0 0 0 0 0 1 2 3 4
 *      0 0 0 0 0 0 0 1 2 3
 *      0 0 0 0 0 0 0 0 1 2
 *      0 0 0 0 0 0 0 0 0 1
 */

public class Solution95 {

    public int[][] getMatrix() {
        int N = 10;
        int[][] matrix = new int[N][N];
        int j;
        int counter = 1;

        for (int i = 0; i < N; i++) {
            for (j = 0; j < i; j++) {
                matrix[i][j] = 0;
            }
            for (int k = j; k < N; k++) {
                matrix[i][k] = counter;
                counter++;
            }
            counter = 1;
        }
        printMatrix(matrix);
        return matrix;
    }

    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
