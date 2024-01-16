package com.restful.booker.testsuite;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BookingExtraction {
    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        response = given()
                .when()
                .get("/booking")
                .then().statusCode(200);

        //Extract the value of the  lastname
        List<String> lastName = response.extract().path("booking.lastname");
        System.out.println("The value of lastname is  : " + lastName);

        //Extract the length of the data
        List<Integer> listOfData = response.extract().path("data.length");
        System.out.println("The size of the data is : " + listOfData .size());

        //Extract Booking ID from the lists
        List<Integer> bookingId = response.extract().path("bookingid");
        System.out.println("The Booking ID  is : " + bookingId);

    }
}
