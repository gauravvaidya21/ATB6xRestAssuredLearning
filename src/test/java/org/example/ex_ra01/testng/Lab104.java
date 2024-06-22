package org.example.ex_ra01.testng;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Lab104 {

    @Description("TC1 - Verify GET Request 1")
    @Test

    public void getRequest(){

        System.out.println("TC");
    }

    @Description("TC2 - Verify GET Request 2")
    @Test

    public void getRequest1(){

        System.out.println("TC1");
    }

    @Description("TC3 - Verify GET Request 3")
    @Test

    public void getRequest2(){

        System.out.println("TC2");
    }
}
