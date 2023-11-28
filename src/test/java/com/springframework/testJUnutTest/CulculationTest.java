package com.springframework.testJUnutTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class CulculationTest {
    public Culculation test = new Culculation();
    int[] numbers = new int[]{1,2,3,4};
    @Test
    void sum() {
        int result = test.sum(numbers);
        assertEquals(10,result);
    }

    @Test
    void subscription() {
        int result = test.subscription(8,6);
        assertEquals(2,result);
    }

    @Test
    void isEven() {
        Boolean result = test.isEven(10);
        assertTrue(result);
    }

    @Test
    void reverseArray() {
        int [] result = test.reverseArray(numbers);
        assertArrayEquals(result,result);
    }
}