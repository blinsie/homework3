package com.alevel.tasks266.task43;

import org.junit.Assert;
import org.junit.Test;

public class Solution43Test {

    private int[] minAndMaxArray = new int[]{-25, 69, 25, 49, 99, 1, 12, 25};
    private int[] emptyArray = new int[]{};
    private int[] singleNumberArray = new int[]{666};
    private int[] maxAndMinArray = new int[]{5625, 0, 0, 0, -5624};
    private Solution43 solution43 = new Solution43();

    @Test
    public void findSumBetweenMinAndMaxTest() {
        Assert.assertEquals(217, solution43.findSumBetweenMaxAndMin(minAndMaxArray));
    }

    @Test
    public void findSumInEmptyArrayTest() {
        Assert.assertEquals(0, solution43.findSumBetweenMaxAndMin(emptyArray));
    }

    @Test
    public void findSumBetweenMaxAndMinTest() {
        Assert.assertEquals(1, solution43.findSumBetweenMaxAndMin(maxAndMinArray));
    }

    @Test
    public void findSumBetweenMinAndMaxInSingleNumberArrayTest() {
        Assert.assertEquals(1332, solution43.findSumBetweenMaxAndMin(singleNumberArray));
    }
}