package com.klezovich.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {

    private Map<String, Shape> nameToShape = new HashMap<>();

    public ShapeRegistry() {
        nameToShape.put("default_circle", new Circle(1));
        nameToShape.put("default_rectangle", new Rectangle(1,1) );
    }

    public void add(String name, Shape shape) {
        nameToShape.put(name, shape);
    }

    public Shape get(String key) {
       return nameToShape.get(key).clone();
    }
}
