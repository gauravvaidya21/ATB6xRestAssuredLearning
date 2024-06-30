package org.example.ex_ra01.ex_25062024;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab124 {

    // Grouping of Test Cases
    //  100 ->  20 P0, 30 - P1, 50 - P3
    // 40 - Smoke, 60 Sanity Testcase.

    @Issue("TC!_Issue")
    @AllureId("TC#1")
    @Severity(SeverityLevel.NORMAL)
    @Description("Sanity TC")
    @Test(groups={"sanity"},priority = 1)
    public void SanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
    }

    @Test(groups={"reg"},priority = 2)
    public void RegRun() {
        System.out.println("Reg");
    }

    @Test(groups={"smoke"},priority = 3)
    public void SmokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }

    @Test(groups={"qa","prod"},priority = 3)
    public void QARun() {
        System.out.println("qa");
        //Assert.assertTrue(false);
    }

    @Test(groups={"prod"},priority = 3)
    public void ProdRun() {
        System.out.println("prod");
        //Assert.assertTrue(false);
    }
}
