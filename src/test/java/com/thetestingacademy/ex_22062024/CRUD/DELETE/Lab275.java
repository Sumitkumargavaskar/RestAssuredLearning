package com.thetestingacademy.ex_22062024.CRUD.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab275 {
    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse vr;
    String token = "d0049529d78b1f6";
    String bookingid = "3671";


    String Base_URL =  "https://restful-booker.herokuapp.com";
    String Base_PATH =  "/booking";

    @Test
    public void testDeleteREQUESTNonBDD() {
        String Base_PATH_UPDATED = Base_PATH+"/"+bookingid;
        System.out.println(Base_PATH_UPDATED);


          r.baseUri(Base_URL);
          r.basePath(Base_PATH_UPDATED);
          r.contentType(ContentType.JSON);
          r.cookie("token",token);
          r.log().all();
          response = r.when().log().all().delete();

          vr = response.then().log().all();
          vr.statusCode(201);





}
    }

