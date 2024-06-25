package org.example.ex_ra01.CRUD.GET.NonBDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab113 {

        @Test
        public void getRequestPositive(){

            RequestSpecification r= RestAssured.given();
            r.baseUri("https://restful-booker.herokuapp.com");
            r.basePath("/booking/2002").log().all();
            r.when().get();
            r.then().log().all().statusCode(200);
        }

        //body ,header ,response data

    @Test
    public void getRequestNegative(){

        RequestSpecification r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/-11").log().all();
        r.when().get();
        r.then().log().all().statusCode(404);
    }


}
