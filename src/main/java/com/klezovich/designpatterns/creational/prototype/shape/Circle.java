package com.klezovich.designpatterns.creational.prototype.shape;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Circle extends Shape{

    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    public Shape clone() {
        return new Circle(this);
    }

}
