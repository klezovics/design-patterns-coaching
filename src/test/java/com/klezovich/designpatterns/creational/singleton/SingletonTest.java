package com.klezovich.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void testSingleton() {

        var singleton1 = Singleton.getInstance();
        var singleton2 = Singleton.getInstance();

        assertTrue(singleton1 == singleton2);
    }

}