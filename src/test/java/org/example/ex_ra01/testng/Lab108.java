package org.example.ex_ra01.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab108 {

    //CRUD

    //Integration scenario
    //crete booking -> ID
    //create authentication -> Token
    //PUT ->ID, Token
    //Delete ->ID
    //Get -> ID --verify it should not exist

    String Token;
    Integer bookingID;

    public String getToken(){

        Token="123";
        return Token;

    }

    @BeforeTest

    public void getTokenAndBookingID(){

        Token=getToken();
        //POST req
        //POST code
        bookingID=123;
    }

    @Test
    public void testPUTReq(){
        System.out.println(Token);
        System.out.println(bookingID);
        //PUT code
    }

    @Test
    public void testDeleteReq(){

        System.out.println(Token);
        System.out.println(bookingID);
        //Delete code
    }

    @Test
    public void testGetReq(){

        System.out.println(Token);
        System.out.println(bookingID);
        //Get Token code
    }





}
