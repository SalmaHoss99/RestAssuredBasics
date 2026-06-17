package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

public class GetuserTest extends BaseTest {

    @Test
    public void GetSingleUser(){
        given().
                header("x-api-key","reqres_bc462ca454734ed2b71eb04cc8df4613").
                pathParams("id",2).
        when().
                get("/api/users/{id}").
        then()
                .statusCode(200)
                .body("data.email",notNullValue())
                .body("data.id",equalTo(2))
                .body("data.first_name",equalTo("Janet"));

    }
    @Test
    public void GetUsersByPage(){
        given().
                header("x-api-key","reqres_bc462ca454734ed2b71eb04cc8df4613").
                queryParam("page",2).
        when().
                get("/api/users").
        then()
                .statusCode(200)
                .body("page", equalTo(2))
                .body("data", not(empty()));
    }


    @Test
    public void GetUsers(){
        String apiKey = "reqres_bc462ca454734ed2b71eb04cc8df4613";
        given()
                .header("x-api-key", apiKey)
                .when()
                .get("/api/users")
                .then()
                .statusCode(200);
    }
  @Test
    public void getNotExistingUser(){
      String apiKey = "reqres_bc462ca454734ed2b71eb04cc8df4613";
      given()
              .pathParams("id",100)
              .header("x-api-key",apiKey)
      .when()
              .get("/api/users/{id}")
      .then()
              .statusCode(404)
              .log().body();
  }
    @Test
    public void getExistingUser() {
        String apiKey = "reqres_bc462ca454734ed2b71eb04cc8df4613";
        given()
                .pathParams("id", 2)
                .header("x-api-key", apiKey)
                .when()
                .get("/api/users/{id}")
                .then()
                .statusCode(200)
                .log().all();
    }
    @Test
    public void getExistingUser01() {
        String apiKey = "reqres_bc462ca454734ed2b71eb04cc8df4613";
        given()
                .pathParams("id", 2)
                .header("x-api-key", apiKey)
                .when()
                .get("/api/users/{id}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
