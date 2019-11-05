package com.alevel.tasks266.task29;

public class Solution29 {

    /**
     * Даны целые положительные числа. Найти среди них те, которые являются
     * квадратами некоторого числа m.
     */

    public int[] findSquaresInArray(int[] array, int m) {
        int[] indices = new int[array.length];
        int ind = 0;

        if ((m <= 0) || (array.length == 0))
            return new int[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == m*m) {
                indices[ind] = i;
                ind++;
            }
        }
        int result[] = new int[ind];
        System.arraycopy(indices, 0, result, 0, ind);
        return result;
    }

}
