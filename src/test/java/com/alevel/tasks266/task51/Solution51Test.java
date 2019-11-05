package com.alevel.tasks266.task51;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution51Test {

    private int[] firstArray = new int[]{-25, 69, 25, 49, 99, 1, 12, 25};
    private int[] secondArray = new int[]{5625, 0, 0, -5624};
    private int[] emptyArray = new int[]{};
    private int[] singleNumberArray = new int[]{666};
    private int[] singlePointArray = new int[]{666, 666};
    private Solution51 solution51 = new Solution51();


    @Test
    public void findFirstRadiusTest() {
        Assert.assertEquals(100, solution51.findRadius(firstArray));
    }

    @Test
    public void findSecondRadiusTest() {
        Assert.assertEquals(5625, solution51.findRadius(secondArray));
    }

    @Test
    public void findRadiusInEmptyArrayTest() {
        Assert.assertEquals(0, solution51.findRadius(emptyArray));
    }

    @Test
    public void findRadiusInSingleNumberArrayTest() {
        Assert.assertEquals(0, solution51.findRadius(singleNumberArray));
    }

    @Test
    public void findRadiusInSinglePointArrayTest() {
        Assert.assertEquals(942, solution51.findRadius(singlePointArray));
    }
}