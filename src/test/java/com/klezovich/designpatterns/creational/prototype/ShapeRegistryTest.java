package com.klezovich.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeRegistryTest {

    @Test
    void testCanGetAndAndShapes() {
        var registry = new ShapeRegistry();
        assertEquals(1,((Circle) registry.get("default_circle")).getRadius());

        var r = new Rectangle(2,2);
        registry.add("big_rectangle", r);
        assertEquals(r, registry.get("big_rectangle"));
    }

}