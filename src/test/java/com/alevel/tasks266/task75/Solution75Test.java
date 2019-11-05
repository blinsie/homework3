package com.alevel.tasks266.task75;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution75Test {

    private int[] firstArray = new int[]{-25, 69, 25, 49, 99, 1, 12, 25};
    private int[] secondArray = new int[]{5625, 0, 0, -5624};
    private int[] emptyArray = new int[]{};
    private int[] singleNumberArray = new int[]{666};
    private int[] twoSimilarArray = new int[]{666, 666};
    private Solution75 solution75 = new Solution75();

    private void printSortedArray(int[] array) {
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void insertionSortFirstTest() {
        int length = firstArray.length;

        solution75.insertionSort(firstArray);
        //printSortedArray(firstArray);

        Assert.assertEquals(length, firstArray.length);

        for (int i = 0; i < firstArray.length - 1; i++) {
            Assert.assertTrue(firstArray[i] <= firstArray[i + 1]);
        }
    }

    @Test
    public void insertionSortSecondTest() {
        int length = secondArray.length;

        solution75.insertionSort(secondArray);
       // printSortedArray(secondArray);

        Assert.assertEquals(length, secondArray.length);

        for (int i = 0; i < secondArray.length - 1; i++) {
            Assert.assertTrue(secondArray[i] <= secondArray[i + 1]);
        }
    }

    @Test
    public void insertionSortEmptyTest() {
        int length = emptyArray.length;

        solution75.insertionSort(emptyArray);

        Assert.assertEquals(length, emptyArray.length);     // = 0
    }

    @Test
    public void insertionSortSingleTest() {
        int length = singleNumberArray.length;

        solution75.insertionSort(singleNumberArray);

        Assert.assertEquals(length, singleNumberArray.length);     // = 1
        Assert.assertEquals(666, singleNumberArray[0]);
    }

    @Test
    public void insertionSortTwoSimilarTest() {
        int length = twoSimilarArray.length;

        solution75.insertionSort(twoSimilarArray);

        Assert.assertEquals(length, twoSimilarArray.length);     // = 1
        Assert.assertEquals(666, twoSimilarArray[0]);
        Assert.assertEquals(666, twoSimilarArray[1]);
    }
}