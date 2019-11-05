package com.alevel.tasks266.task43;

/**
 * Дан массив чисел. Найти сумму элементов массива, расположенных между
 * минимальным и максимальным элементами включительно.
 */

public class Solution43 {

    public int findSumBetweenMaxAndMin(int[] array) {
        int resultSum = 0;
        int max = 0;
        int min = 0;
        int indMax = 0;
        int indMin = 0;

        if (array.length == 0)
            return 0;

        if (array.length == 1)
            return array[0] + array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indMax = i;
            }
            if (min > array[i]) {
                min = array[i];
                indMin = i;
            }
        }

        if (indMin > indMax) {
            max = indMin;
            indMin = indMax;
            indMax = max;
        }

        for (int j = indMin; j <= indMax ; j++) {
            resultSum += array[j];
        }

        return resultSum;
    }

}
