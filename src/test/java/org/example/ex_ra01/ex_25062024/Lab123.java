package org.example.ex_ra01.ex_25062024;

import org.testng.annotations.Test;

public class Lab123 {

    // when priority is same then alphabetically execution will happen
    @Test(priority = 1)
    public void testMethodB() {
        System.out.println("Test Method B");
    }

    @Test(priority = 1)
    public void testMethodA() {
        System.out.println("Test Method A");
    }

    @Test(priority = 1)
    public void testMethodC() {
        System.out.println("Test Method C");
    }
}
