package org.example.ex_ra01.testng;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab103 {

    @Description("TC1 - Verify GET Request 1 in 103")
    @Test
    public void getRequest(){

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()

                .get().then()

                .statusCode(201);
    }

    @Description("TC2 - Verify GET Request 2 in 103")
    @Test
    public void getRequest1(){

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()

                .get().then()

                .statusCode(201);
    }
}
