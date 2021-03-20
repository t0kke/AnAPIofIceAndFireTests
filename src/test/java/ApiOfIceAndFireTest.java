import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.hamcrest.Matchers.equalTo;

public class ApiOfIceAndFireTest extends BaseTest {
    @Test
    void charactersTest() {

        given()
                .when()
                .get(EndpointUrl.CHARACTERS.addPath("/52")).then().assertThat()
                .statusCode(HTTP_OK)
                .body(matchesJsonSchemaInClasspath("reference_characters.json"));
    }

    @Test
    void checkAvailabilityJonSnow() {
        given()
                .when()
                .get(EndpointUrl.CHARACTERS.addPath("/583")).then().assertThat()
                .statusCode(HTTP_OK)
                .body("name", equalTo("Jon Snow"))
                .log().body();
    }

    @Test
    void housesTest() {
        given()
                .when()
                .get(EndpointUrl.HOUSES.addPath("/378")).then().assertThat()
                .statusCode(HTTP_OK)
                .body(matchesJsonSchemaInClasspath("reference_houses.json"));

    }
}
