package org.example.ex_ra01;



import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab106 {


    @Description("TC#1")
    @Test
    public void testCase(){

        // Assertion ->  Expect Result = Actual Result
        // 200 == 200

        // Two Types Assertions

        // Soft Assertions

        SoftAssert s = new SoftAssert();

        s.assertEquals("pramod","pramod","Equal");
        //s.assertEquals("amit","Pramod","Not Equal");
        System.out.println("End of the Program");
        System.out.println("End of 2");
        s.assertAll();

        // PUT -> token


        // Hard Assertion

//        Assert.assertEquals("pramod","pramod","Equal");
//        System.out.println("End of the program");



    }

}


