package com.example.lab_11_web_app_new;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void Test(){
        int Expected = 10;
        int input = 5;

        ResponseEntity<Integer> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/double?number=" + input, Integer.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(Expected,responseEntity.getBody());
    }
}
