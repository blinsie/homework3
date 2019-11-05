package com.alevel.tasks266.task143;

/**
 * Составить программу нахождения наибольшего общего делителя и наименьшего
 * общего кратного двух натуральных чисел.
 *
 *                          А х В
 *          НОК(А, В) =   ---------
 *                        НОД(А, В)
 */

public class Solution143 {

    public int getNod(int a, int b) {
        int tmp;

        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return  a;
    }

    public int getNok(int a, int b) {
        return (a * b)/getNod(a, b);
    }

}
