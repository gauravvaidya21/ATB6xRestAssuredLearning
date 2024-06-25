package org.example.ex_ra01.CRUD.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab119 {

    RequestSpecification r=RestAssured.given();
    Response response;
    ValidatableResponse vr;
    String token="4b215a825257659";
    String bookingID= "382";

    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";

    @Test
    public void testDELETERequestNonBDD(){
       String Base_PATH_Updated= "BASE_PATH"+"/"+bookingID;
        System.out.println(Base_PATH_Updated);



               r.baseUri(BASE_URL);
               r.basePath(Base_PATH_Updated);
               r.contentType(ContentType.JSON);
               r.cookie("token",token);
               r.log().all();

               response=r.when().log().all().patch();

               vr=response.then().log().all();
               vr.statusCode(201);





    }
}
