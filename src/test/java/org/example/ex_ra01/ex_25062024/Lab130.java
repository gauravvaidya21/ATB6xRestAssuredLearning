package org.example.ex_ra01.ex_25062024;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Lab130 {

    @Test
    public void testDemo1() {

        // Randomd User or Password

        Faker faker = new Faker();
        String username = faker.name().username();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        System.out.println(username);
        System.out.println(phoneNumber);
    }
}