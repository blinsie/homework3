package com.alevel.tasks266.task143;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution143Test {

    private Solution143 solution143 = new Solution143();

    @Test
    public void getNodFirstTest() {
        Assert.assertEquals(333, solution143.getNod(999, 666));
    }

    @Test
    public void getNokFirstTest() {
        Assert.assertEquals(1998, solution143.getNok(999, 666));
    }

    @Test
    public void getNodLargeNumberTest() {
        Assert.assertEquals(5, solution143.getNod(22124455, 488123645));
    }

    @Test
    public void getNokLargeNumberTest() {
        Assert.assertEquals(397142632, solution143.getNok(22124455, 488123645));
    }
    @Test
    public void getNodPrimeNumberTest() {
        Assert.assertEquals(1, solution143.getNod(17, 37));
    }

    @Test
    public void getNokPrimeNumberTest() {
        Assert.assertEquals(629, solution143.getNok(17, 37));
    }
}