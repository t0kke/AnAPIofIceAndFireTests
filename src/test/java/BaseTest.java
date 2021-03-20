import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.given;

public class BaseTest {
    @BeforeAll
    public static void configureRestAssured() {
        RestAssured.baseURI = "https://anapioficeandfire.com/api";
        RestAssured.requestSpecification = given()
                .contentType("application/json")
                .accept("application/json");
    }
}
