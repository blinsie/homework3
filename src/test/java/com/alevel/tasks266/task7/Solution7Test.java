package com.alevel.tasks266.task7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution7Test {

    private double[] firstArray = new double[]{2.2, 69.69, 9.003, -32, 99.432, 0, -12.12};
    private double[] zeroArray = new double[]{0.0, 0.0, 0.0, 0.0};
    private double[] emptyArray = new double[]{};
    private double[] oneLengthArray = new double[]{6.66};
    private Solution7 solution7 = new Solution7();

    @Test
    public void setUpperBoundGoodTest() {
        Assert.assertEquals(2, solution7.setUpperBound(firstArray, 69.0));
        for (int i = 0; i < firstArray.length; i++) {
            Assert.assertTrue(firstArray[i] <= 69.0);
        }
    }

    @Test
    public void setUpperBoundZeroTest() {
        Assert.assertEquals(4, solution7.setUpperBound(firstArray, 0.0));
        for (int i = 0; i < firstArray.length; i++) {
            Assert.assertTrue(firstArray[i] <= 0.0);
        }
    }

    @Test
    public void setUpperBoundInZerosArrayTest() {
        Assert.assertEquals(zeroArray.length, solution7.setUpperBound(zeroArray, -3.7));
        for (int i = 0; i < zeroArray.length; i++) {
            Assert.assertTrue(zeroArray[i] <= -3.7);
        }
    }

    @Test
    public void setUpperBoundInEmptyArrayTest() {
        Assert.assertEquals(0, solution7.setUpperBound(emptyArray, 69.0));
        Assert.assertTrue(emptyArray.length == 0);
    }

    @Test
    public void setUpperBoundInOneLengthArrayTest() {
        Assert.assertEquals(0, solution7.setUpperBound(oneLengthArray, 666.0));
        Assert.assertTrue(oneLengthArray[0] == 6.66);
    }
}