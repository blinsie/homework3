package com.alevel.tasks266.task109;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution109Test {

    private Solution109 solution109 = new Solution109();

    int[][] emptyMatrix = new int[][]{};

    int[][] magicMatrix2 = new int[][] {
            {5, 5},
            {5, 5}
    };

    int[][] magicMatrix3 = new int[][] {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
    };

    int[][] notMagicMatrix = new int[][] {
            {2, 1, 6},
            {9, 5, 0},
            {42, 3, 8}
    };

    int[][] magicMatrix4 = new int[][] {
            {7, 12, 1, 14},
            {2, 13, 8, 11},
            {16, 3, 10, 5},
            {9, 6, 15, 4}
    };

    @Test
    public void isMagicMatrix2RangeTrueTest() {
        Assert.assertTrue(solution109.isMagicMatrix(magicMatrix2));
    }


    @Test
    public void isMagicMatrix3RangeTrueTest() {
        Assert.assertTrue(solution109.isMagicMatrix(magicMatrix3));
    }

    @Test
    public void isMagicMatrix3RangeFalseTest() {
        Assert.assertFalse(solution109.isMagicMatrix(notMagicMatrix));
    }

    @Test
    public void isMagicMatrix4RangeTrueTest() {
        Assert.assertTrue(solution109.isMagicMatrix(magicMatrix4));
    }

    @Test
    public void isMagicMatrixEmptyTest() {
        Assert.assertFalse(solution109.isMagicMatrix(emptyMatrix));
    }
}