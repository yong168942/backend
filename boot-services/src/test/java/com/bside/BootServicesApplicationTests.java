package com.bside;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class BootServicesApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testSpringBootApplication() throws JsonProcessingException, IOException {
        String body = restTemplate.getForObject("/hello", String.class);
        assertThat("Hello returned?", new ObjectMapper().readTree(body).get("message").textValue().equals("Hello BSide Gangnam!"));
    }

}
