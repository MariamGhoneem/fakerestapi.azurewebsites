package authors;

import base.BaseTest;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostAuthor extends BaseTest {
String jsonString = "{\"id\" : \"2\",\"firstName\" : , \"lastName\" : \"ghoneem\"}";

    @Test
     public void firstNameLastNameShouldBeMandatory() {
        given()
                .contentType(ContentType.JSON)
                .spec(requestSpec).body(jsonString)
        .when()
                .post("/api/v1/Authors")
        .then()
                .assertThat()
                .body("firstName", Matchers.notNullValue(),"lastName", Matchers.notNullValue());
    }
    @Test
    public void StatusCodeIs200() {
        given()
                .contentType(ContentType.JSON)
                .spec(requestSpec).body(jsonString)
        .when()
                .post("/api/v1/Authors")
        .then()
                .assertThat()
                .statusCode(200);
    }
}
