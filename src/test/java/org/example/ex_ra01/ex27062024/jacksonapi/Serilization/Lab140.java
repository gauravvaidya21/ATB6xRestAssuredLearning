package org.example.ex_ra01.ex27062024.jacksonapi.Serilization;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;
//import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import org.example.ex_ra01.ex27062024.gson.Serialization.Booking;
import org.example.ex_ra01.ex27062024.gson.Serialization.BookingDates;
import org.testng.annotations.Test;

public class Lab140 {

    @Test
    public void SeraJackson() throws JsonProcessingException {


        Booking booking = new Booking();
        booking.setFirstname("James");
        booking.setLastname("Brown");
        booking.setTotalprice(-1);
        booking.setDepositpaid(true);

        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);


        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        System.out.println(jsonString);




    }
}
