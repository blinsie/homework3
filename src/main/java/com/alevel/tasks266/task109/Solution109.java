package com.alevel.tasks266.task109;

/**
 * Дана целая квадратная матрица n-го порядка. Определить, является ли она
 * магическим квадратом, т.е. такой, в которой суммы элементов в строках и
 * столбцах одинаковы.
 */

public class Solution109 {

    public boolean isMagicMatrix(int[][] matrix) {
        int sum = 0;
        int sumRows = 0;
        int sumColumns = 0;

        if (matrix.length == 0)
            return false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumRows += matrix[i][j];
                sumColumns += matrix[j][i];
            }
            if (sumRows != sumColumns)
                return false;
            else if ((sum != 0) && (sum != sumRows))
                return false;
            else {
                sum = sumRows;
                sumRows = 0;
                sumColumns = 0;
            }
        }

        return true;
    }

}
