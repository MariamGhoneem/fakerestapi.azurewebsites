package authors;

import org.testng.annotations.Test;

import static base.BaseTest.requestSpec;
import static io.restassured.RestAssured.*;

public class GetAuthors {
    @Test
    public void StatusCodeIs200() {

        given().
                spec(requestSpec).
        when().
                get("/api/v1/Authors").
        then().
                assertThat().
                statusCode(200);
    }
}
