package com.alevel.tasks266.task79;

import java.util.Arrays;

/**
 * Алгоритм фон Неймана. Упорядочить массив по неубыванию с помощью алгоритма
 * сортировки слияниями: каждая пара соседних элементов сливается в одну группу
 * из двух элементов(последняя группа может состоять из одного элемента), затем
 * каждая пара соседних двухэлементных групп сливается в четырехэлементную и т.д.
 * При каждом слиянии новая укрупненная группа упорядочивается.
 */

public class Solution79 {

    public int[] vonNeumannAlgorithm(int[] array) {
            int len = array.length;
            if (len < 2)
                return array;
            int middle = len / 2;
            return merge(vonNeumannAlgorithm(Arrays.copyOfRange(array, 0, middle)),
                    vonNeumannAlgorithm(Arrays.copyOfRange(array, middle, len)));

    }

    private static int[] merge(int[] firstArray, int[] secondArray) {
        int firstLength = firstArray.length;
        int secondLength = secondArray.length;

        int counter1 = 0;
        int counter2 = 0;
        int len = firstLength + secondLength;

        int[] result = new int[len];
        for (int i = 0; i < len; i++) {

            if (counter2 < secondLength && counter1 < firstLength) {

                if (firstArray[counter1] > secondArray[counter2]) {
                    result[i] = secondArray[counter2++];
                } else {
                    result[i] = firstArray[counter1++];
                }

            } else if (counter2 < secondLength) {
                result[i] = secondArray[counter2++];
            } else {
                result[i] = firstArray[counter1++];
            }
        }
        return result;
    }

}
