package com.alevel.tasks266.task7;

/**
 * Дана последовательность действительных чисел. Заменить все ее члены,
 * большие данного Z, этим числом. Посчитать количество замен.
 */

public class Solution7 {

    public int setUpperBound(double[] array, double value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                array[i] = value;
                counter++;
            }
        }
        return counter;
    }

}
