package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UsersApiTest{
/*
    @Test
    public void getSingleUserShouldReturnStatusCode200() {

        RestAssured.baseURI = "https://reqres.in";

        given()
                .header("x-api-key", "reqres-free-v1")
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .body("data.id", equalTo(2));
    }
    */

}