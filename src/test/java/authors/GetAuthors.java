package authors;

import base.BaseTest;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetAuthors extends BaseTest{
    public static RequestSpecification requestSpec;

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

    @Test
    public void correctResponseObjects() {
        given().
                spec(requestSpec).
        when().
                get("/api/v1/Authors").
        then().
                //??
              body();
    }
}

