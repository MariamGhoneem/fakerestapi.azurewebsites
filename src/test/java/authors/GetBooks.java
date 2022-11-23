package authors;

import base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBooks extends BaseTest {
    @Test
    public void correctBookId(){
        int id = 1;
        given().
                spec(requestSpec).
        when().
                get("/api/v1/Authors/authors/books/"+id +"").
        then().
                assertThat().
                statusCode(200);
    }
}
