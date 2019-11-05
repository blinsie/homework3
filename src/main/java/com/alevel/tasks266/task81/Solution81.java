package com.alevel.tasks266.task81;

/**
 * Сформировать квадратную матрицу порядка N по заданному образцу:
 *
 *      0   0   0 1
 *      0   0   2 0
 *      . . . . . .
 *      0   n-1 0 0
 *      n   0   0 0
 */

public class Solution81 {

    public int[][] formMatrix(int N) {
        int size = N;
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            matrix[i][--size] = i + 1;
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
