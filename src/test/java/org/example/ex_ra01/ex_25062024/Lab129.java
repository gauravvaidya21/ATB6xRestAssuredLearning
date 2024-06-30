package org.example.ex_ra01.ex_25062024;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab129 {

    // Data Driven Testing - TestNG
    // Mix the Data Driven with the Apache POI
    // Data Driven Testing -. Running a Single Test case with Multiple Inputs
    // Login Test - 100 U/P

    @DataProvider
    public Object[][] getData() {


        return new Object[][]{
                new Object[]{"admin", "password"},
                new Object[]{"admin", "password123"},
                new Object[]{"admin", "admin"}
        };
    }

    @DataProvider
    public Object[][] getDataFromExcel() {
        // ApachePOI CODE
        // Read a Excel File which contain the data and give to the getData Function
        return null;
    }


    @Test(dataProvider = "getData")
    public void testAuthToGetToken(String username, String password) {
        System.out.println(username);
        System.out.println(password);

        // Rest Assured Login

        // Rest Given -> when -> then -> 200 Ok or Response

    }
}