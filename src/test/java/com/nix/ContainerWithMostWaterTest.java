package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    @Test
    public void maxArea() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int [] numbers = {1,8,6,2,5,4,8,3,7};
        int actual = containerWithMostWater.maxArea(numbers);
        int expected = 49;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void maxAreaNull() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int [] numbers = {0, 0, 0, 0, 0};
        int actual = containerWithMostWater.maxArea(numbers);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}