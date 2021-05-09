package com.klezovich.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testRectangleCloneMethod() {
        var r = new Rectangle(2,3);

        var clone = r.clone();

        assertEquals(r, clone);
        assertFalse(r == clone);

        assertEquals("black", clone.getColor());
    }

    @Test
    void testCircleCloneMethod() {
        var c = new Circle(2);
        var clone = c.clone();

        assertEquals(c, clone);
        assertFalse(c == clone);
    }

    void drawShape(Shape s) {
        // draw shape
        // I want to clone the shape ...
        // 1. Find type of object var shapeClass = s.getClass();
        // 2. Call constructor var
        // 3. Call setters shapeCl

        //var shapeClone = s.clone();
    }
}