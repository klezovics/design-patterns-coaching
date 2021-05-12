package com.klezovich.designpatterns.creational.singleton.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiConfigTest {

    @Autowired
    private ApiConfig config;

    @Autowired
    private ApiConfigImmutable immutable;

    @Test
    void testConfig() {
        assertEquals("AK",config.getId());
        assertEquals("MyApiKey", config.getKey());
    }

    @Test
    void testImmutableConfig() {
        assertEquals("AK",immutable.getId());
        assertEquals("MyApiKey", immutable.getKey());
    }
}