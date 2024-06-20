package org.example.ex_ra01;

import  io.restassured.RestAssured;

import org.hamcrest.Matcher;


public class Lab101 {

    public static void main(String[] args) {

        //Rest assured hello world

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()

                .get().then()

                .statusCode(201);






    }
}
