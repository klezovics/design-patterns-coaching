package com.klezovich.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {HelloComponent.class, HelloService.class})
class HelloServiceTest {

    @Autowired
    private HelloService service;

    @Test
    void testCanGetHello() {
        assertEquals("hello", service.getHello());
    }
}