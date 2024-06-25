package org.example.ex_ra01.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab117 {

    RequestSpecification r=RestAssured.given();
    Response response;
    ValidatableResponse vr;
    String token="4b215a825257659";
    String bookingID= "382";

    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";

    @Test
    public void testPUTRequestNonBDD(){
       String Base_PATH_Updated= "BASE_PATH"+"/"+bookingID;
        System.out.println(Base_PATH_Updated);

        String Payload="{\n" +
                "    \"firstname\": \"Jim\",\n" +
                "    \"lastname\": \"Brown\",\n" +
                "    \"totalprice\": 111,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";

               r.baseUri(BASE_URL);
               r.basePath(Base_PATH_Updated);
               r.contentType(ContentType.JSON);
               r.cookie("token",token);
               r.body(Payload).log().all();

               response=r.when().log().all().put();

               vr=response.then().log().all();
               vr.statusCode(200);
               vr.body("firstname", Matchers.equalTo("Jim"));
               vr.body("lastname", Matchers.equalTo("Brown"));




    }
}
