package com.klezovich.designpatterns.creational.prototype.shape;

import com.klezovich.designpatterns.creational.prototype.shape.Circle;
import com.klezovich.designpatterns.creational.prototype.shape.Rectangle;
import com.klezovich.designpatterns.creational.prototype.shape.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//TODO: Read this https://refactoring.guru/design-patterns/prototype
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