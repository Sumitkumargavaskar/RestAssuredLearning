package com.thetestingacademy.ex_25062024;

import org.testng.annotations.Test;

public class Lab278 {
    //Testng priority in java
    // TestNG also allows the use of negative priority values.

    @Test(priority = 1)
    public void testMethodOne() {
        System.out.println("Test Method one");

    }
    @Test(priority = 2)
    public void testMethodTwo() {
        System.out.println("Test Method two");

    }
    @Test(priority = 0)
    public void testMethodZero() {
        System.out.println("Test Method zero");

    }
    @Test(priority = -1)
    public void testMethodNegativeOne() {
        System.out.println("Test Method Negative One");
    }
}
