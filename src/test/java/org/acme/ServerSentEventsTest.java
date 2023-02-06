package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import jakarta.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;

@QuarkusTest
public class ServerSentEventsTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/server-sent-events-ping")
                .then().statusCode(HttpStatus.SC_OK)
                .contentType(MediaType.SERVER_SENT_EVENTS)
                .body(containsString("ping pong"));

    }

}