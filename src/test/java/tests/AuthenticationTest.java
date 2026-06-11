package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthenticationTest extends BaseTest {
    @Test
    public void validUserRegisteration(){
        given()
                .contentType("application/json")
                .header("x-api-key","reqres_bc462ca454734ed2b71eb04cc8df4613")
                .body("""
                             {
                                "email": "salma.holt@reqres.in",
                                "password": "pistol"
                              }
                               """)
        .when()
                .post("/api/register")

        .then()
                .log()
                .body()
                .statusCode(200);

    }
}
