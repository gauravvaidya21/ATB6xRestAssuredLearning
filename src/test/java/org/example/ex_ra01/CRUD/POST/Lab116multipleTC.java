package org.example.ex_ra01.CRUD.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab116multipleTC {

    RequestSpecification r;
    Response response;
    ValidatableResponse valitadableResponse;

    @Description("TC1 - Verify create booking is working with valid Payload ")
    @Test
    public  void testBDDStylePOSTPositive(){


        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        // given() part
        r= RestAssured.given();

        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        //When () part
        response= r.when().log().all().post();

        String responseString= response.asString();
        System.out.println(responseString);


        //then() part

        valitadableResponse=response.then();

        valitadableResponse.statusCode(200);
    }

    @Description("TC2 - Verify create booking is not working with 500 error")
    @Test
    public  void testBDDStylePOSTNegative(){


        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String payload = "";

        // given() part
        r= RestAssured.given();

        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        //When () part
        response= r.when().log().all().post();

        String responseString= response.asString();
        System.out.println(responseString);


        //then() part

        valitadableResponse=response.then();

        valitadableResponse.statusCode(500);
    }
}
