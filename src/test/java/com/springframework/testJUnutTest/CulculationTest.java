package com.springframework.testJUnutTest;

import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class CulculationTest {
    public Culculation test = new Culculation();
    int[] numbers = new int[]{1,2,3,4};
    @BeforeClass
    public static void beforClassFun(){
        System.out.println("Before Class Every method");
    }
    @Before
    public void befor(){
        System.out.println("Before Every method");
    }
    @Test
    void sum() {
        System.out.println("sum Test Fun.");
        int result = test.sum(numbers);
        assertEquals(10,result);
    }

    @Test
    void subscription() {
        System.out.println("subscription Test Fun.");
        int result = test.subscription(8,6);
        assertEquals(2,result);
    }

    @Test
    void isEven() {
        System.out.println("isEven Test Fun.");
        Boolean result = test.isEven(10);
        assertTrue(result);
    }

    @Test
    void reverseArray() {
        System.out.println("reverseArray Test Fun.");
        int [] result = test.reverseArray(numbers);
        assertArrayEquals(result,result);
    }
    @After
    public void after(){

        System.out.println("After Every method");
    }
    @AfterClass
    public static void afterClassFun(){
        System.out.println("After Class Every method");
    }
}