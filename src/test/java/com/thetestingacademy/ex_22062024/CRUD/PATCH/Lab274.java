package com.thetestingacademy.ex_22062024.CRUD.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab274 {
    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse vr;
    String token = "f8ba8119ff5bbc3";
    String bookingid = "637";


    String Base_URL =  "https://restful-booker.herokuapp.com";
    String Base_PATH =  "/booking";

    @Test
    public void testPatchREQUESTNonBDD() {
        String Base_PATH_UPDATED = Base_PATH+"/"+bookingid;
        System.out.println(Base_PATH_UPDATED);

        String payload = "{\n"+
        " \"firstname\" : \"pramod\"\n" +

        "}";
          r.baseUri(Base_URL);
          r.basePath(Base_PATH_UPDATED);
          r.contentType(ContentType.JSON);
          r.cookie("token",token);
          r.body(payload).log().all();
          response = r.when().log().all().patch();

          vr = response.then().log().all();
          vr.statusCode(200);
          vr.body("firstname", Matchers.equalTo("pramod"));




}
    }

