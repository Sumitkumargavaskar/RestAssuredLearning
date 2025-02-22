package com.thetestingacademy.ex_22062024.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab273 {
    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse vr;
    String token = "f8ba8119ff5bbc3";
    String bookingid = "637";


    String Base_URL =  "https://restful-booker.herokuapp.com";
    String Base_PATH =  "/booking";

    @Test
    public void testPutREQUESTNonBDD() {
        String Base_PATH_UPDATED = Base_PATH+"/"+bookingid;
        System.out.println(Base_PATH_UPDATED);

        String payload = "{\n"+
        " \"firstname\" : \"James\",\n" +
        "    \"lastname\" : \"Brown\",\n" +
        "    \"totalprice\" : 123,\n" +
        "    \"depositpaid\" : true,\n" +
        "    \"bookingdates\" : {\n" +
        "        \"checkin\" : \"2025-01-01\",\n" +
        "        \"checkout\" : \"2025-01-01\"\n" +
        "    },\n" +
        "    \"additionalneeds\" : \"Breakfast,lunch\"\n" +
        "}";
          r.baseUri(Base_URL);
          r.basePath(Base_PATH_UPDATED);
          r.contentType(ContentType.JSON);
          r.cookie("token",token);
          r.body(payload).log().all();
          response = r.when().log().all().put();

          vr = response.then().log().all();
          vr.statusCode(200);
          vr.body("firstname", Matchers.equalTo("James"));
          vr.body("lastname", Matchers.equalTo("Brown"));




}
    }

