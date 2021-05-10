package com.klezovich.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//TODO: Read this https://refactoring.guru/design-patterns/builder
class MyComplexObjectTest {

    @Test
    void testBuildingComplexObjectsWithBuilderIsEasier() {
        var o1 = new MyComplexObject(1,null,null,null,null,100);
        System.out.println(o1);

        var o2 = MyComplexObject.builder().a(1).f(100).build();
        System.out.println(o2);

        assertEquals(o1,o2);
        assertFalse(o1 == o2);
    }
}