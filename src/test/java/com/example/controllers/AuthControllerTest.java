package com.example.controllers;

import com.example.DatabaseDockerInicializer;
import com.example.dto.JwtRequest;
import io.quarkus.test.common.WithTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

@QuarkusTest
@WithTestResource(DatabaseDockerInicializer.class)
public class AuthControllerTest {

    @Test
    public void login() {
        JwtRequest jwtRequest = new JwtRequest("julianoosmir", "$123456");

        given()
                .when()
                .contentType("application/json")
                .body(jwtRequest)
                .post("/auth")
                .then()
                .log().all()
                .statusCode(200);
    }
}
