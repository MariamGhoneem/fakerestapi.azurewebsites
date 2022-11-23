package authors;

import base.BaseTest;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetAuthors extends BaseTest{
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
                contentType("application/json").

        when().
                get("/api/v1/Authors").
        then().
                //??
              //body("id",);
//                assertThat().
                body("[$]",Matchers.hasKey("id")).
                body("[0]",Matchers.hasKey("idBook")).
                body("[0]",Matchers.hasKey("firstName")).
                body("[0]",Matchers.hasKey("lastName"));
    }
}

