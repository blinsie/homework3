package com.alevel.tasks266.task29;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution29Test {

    private int[] firstArray = new int[]{25, 69, 25, 49, 99, 1, 12, 25};
    private int[] emptyArray = new int[]{};
    private int[] oneLengthArray = new int[]{5625};
    private Solution29 solution29 = new Solution29();

    @Test
    public void findSquaresOf5InArrayTest() {
        int[] testResult = solution29.findSquaresInArray(firstArray, 5);
        Assert.assertTrue(testResult.length == 3);

        for (int i = 0; i < testResult.length; i++) {
            Assert.assertTrue(firstArray[testResult[i]] == 5*5);
        }
    }

    @Test
    public void findSquaresOf7InArray7Test() {
        int[] testResult = solution29.findSquaresInArray(firstArray, 7);
        Assert.assertTrue(testResult.length == 1);

        for (int i = 0; i < testResult.length; i++) {
            Assert.assertTrue(firstArray[testResult[i]] == 7*7);
        }
    }

    @Test
    public void findSquaresInEmptyArrayTest() {
        Assert.assertEquals(0, solution29.findSquaresInArray(emptyArray, 3).length);
    }

    @Test
    public void findSquaresOf75InOneLengthArrayTest() {
        Assert.assertEquals(1, solution29.findSquaresInArray(oneLengthArray, 75).length);
    }

    @Test
    public void findSquaresOf22InOneLengthArrayTest() {
        Assert.assertEquals(0, solution29.findSquaresInArray(oneLengthArray, 22).length);
    }
}