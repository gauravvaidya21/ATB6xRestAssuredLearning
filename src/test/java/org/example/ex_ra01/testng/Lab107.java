package org.example.ex_ra01.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab107 {

    @Test
    public void testCase1(){
        Assert.assertEquals(true, true);
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(false, true);
    }
}
