package org.example.ex_ra01.ex_25062024;

import org.testng.annotations.Test;

public class Lab122 {

    @Test(priority=1)
    public void testMethodOne() {
        System.out.println("Test Method One");
    }

    @Test(priority=2)
    public void testMethodTwo() {
        System.out.println("Test Method Two");
    }

    @Test(priority =0)
    public void testMethodZero() {
        System.out.println("Test Method Zero");
    }

    @Test(priority = -1)
    public void testMethodNegativeOne() {
        System.out.println("Test Method Negative One");
    }
}
