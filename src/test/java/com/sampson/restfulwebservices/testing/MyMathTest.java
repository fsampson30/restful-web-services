package com.sampson.restfulwebservices.testing;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void calculateSum() {
        int[] numbers = {1,2,3};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        assertEquals(6,result);

    }
}