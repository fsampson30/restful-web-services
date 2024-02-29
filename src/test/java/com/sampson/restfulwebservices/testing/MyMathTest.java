package com.sampson.restfulwebservices.testing;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void calculateSum() {
        assertEquals(6, math.calculateSum(new int[]{1,2,3}));
    }

    @Test
    void calculateSumEqualsZero() {
        assertEquals(0, math.calculateSum(new int[]{}));
    }
}