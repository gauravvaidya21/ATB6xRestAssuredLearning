package org.example.ex_ra01.ex27062024.gson.Deserilization;

import com.google.gson.Gson;
import org.example.ex_ra01.ex27062024.gson.Serialization.Booking;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab139 {

    @Test
    public void DeSerializationTest(){

        String jsonString = "{\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        Gson gson = new Gson();
        Booking booking = gson.fromJson(jsonString,Booking.class);
        System.out.println(booking.toString());
        System.out.println(booking.getFirstname());

        Assert.assertEquals(booking.getFirstname(),"Jim");




    }
}
