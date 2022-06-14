package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.vertx.http.runtime.devmode.Json;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

    @Test
    public void testPersonEndpoint() {
        given()
                .when().get("/person")
                .then()
                .statusCode(200)
                .body(is("{\"age\":24,\"name\":\"Stefan\",\"placeOfBirth\":\"Lisabona\"}"));
    }
}