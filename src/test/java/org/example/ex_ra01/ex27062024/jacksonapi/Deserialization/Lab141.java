package org.example.ex_ra01.ex27062024.jacksonapi.Deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ex_ra01.ex27062024.gson.Serialization.Booking;
import org.testng.annotations.Test;

public class Lab141 {

    @Test
    public void DeSer() throws JsonProcessingException {
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

        ObjectMapper objectMapper = new ObjectMapper();
        Booking booking = objectMapper.readValue(jsonString, Booking.class);
        System.out.println(booking);
        System.out.println(booking.getFirstname());


    }
}
