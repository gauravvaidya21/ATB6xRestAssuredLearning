package org.example.ex_ra01.CRUD.GET.NonBDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab112 {

    RequestSpecification rs= RestAssured.given();

    @Test                //TC1
    public void getRequestNonBDDStyle(){

        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/560037");

        rs.when().log().all().get();

        rs.then().log().all().statusCode(200);
    }


    @Test                //TC2
    public void getRequestNonBDDStyle2(){

        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/560037");

        rs.when().log().all().get();

        rs.then().log().all().statusCode(200);
    }
}
