package com.alevel.tasks266.task79;


import org.junit.Assert;
import org.junit.Test;

public class Solution79Test {

    private int[] firstArray = new int[]{-25, 69, 25, 49, 99, 1, 12, 25};
    private int[] secondArray = new int[]{5625, 0, 0, -5624};
    private int[] emptyArray = new int[]{};
    private int[] singleNumberArray = new int[]{666};
    private int[] twoSimilarArray = new int[]{666, -666};
    private Solution79 solution79 = new Solution79();

    private void printSortedArray(int[] array) {
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void vonNeumannAlgorithmFirstTest() {
        int[] result = solution79.vonNeumannAlgorithm(firstArray);
       // printSortedArray(result);

        Assert.assertEquals(result.length, firstArray.length);

        for (int i = 0; i < result.length - 1; i++) {
            Assert.assertTrue(result[i] <= result[i + 1]);
        }
    }

    @Test
    public void vonNeumannAlgorithmSecondTest() {
        int[] result = solution79.vonNeumannAlgorithm(secondArray);
       //  printSortedArray(result);

        Assert.assertEquals(result.length, secondArray.length);

        for (int i = 0; i < result.length - 1; i++) {
            Assert.assertTrue(result[i] <= result[i + 1]);
        }
    }

    @Test
    public void vonNeumannAlgorithmEmptyTest() {
        int[] result = solution79.vonNeumannAlgorithm(emptyArray);

        Assert.assertEquals(result.length, emptyArray.length);     // = 0
    }

    @Test
    public void vonNeumannAlgorithmSingleTest() {
        int[] result = solution79.vonNeumannAlgorithm(singleNumberArray);

        Assert.assertEquals(result.length, singleNumberArray.length);     // = 1
        Assert.assertEquals(666, result[0]);
    }

    @Test
    public void vonNeumannAlgorithmTwoSimilarTest() {
        int[] result = solution79.vonNeumannAlgorithm(twoSimilarArray);

        Assert.assertEquals(result.length, twoSimilarArray.length);     // = 1
        Assert.assertEquals(-666, result[0]);
        Assert.assertEquals(666, result[1]);
    }

}